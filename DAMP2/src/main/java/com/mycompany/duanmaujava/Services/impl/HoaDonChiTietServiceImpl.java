/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.DomainModels.HoaDonchiTiet;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.HoaDonChiTietRepository;
import com.mycompany.duanmaujava.Repositories.HoaDonRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.HoaDonChiTietRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.HoaDonRepositoryImpl;
import com.mycompany.duanmaujava.Services.ChiTietHoaDonService;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author acer
 */
public class HoaDonChiTietServiceImpl implements ChiTietHoaDonService {

    private static final HoaDonChiTietRepository REPO_HDCT = new HoaDonChiTietRepositoryImpl();
    private static final HoaDonRepository REPO_HD = new HoaDonRepositoryImpl();
    private static final ChiTietSanPhamRepository REPO_SP = new ChiTietSanPhamRepositoryImpl();

    @Override
    public List<HoaDonchiTiet> getAll() {
        return REPO_HDCT.getAll();
    }

    @Override
    public String save(HoaDonchiTiet t) {
        REPO_HDCT.save(t);
        return "";
    }

    @Override
    public HoaDonchiTiet getOne(HoaDonchiTiet t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTienThua(String tienKhachDua, String tongTien) {
        try {
            if (tienKhachDua.indexOf("f") > 0 || tienKhachDua.indexOf("d") > 0) {
                return "Số tiền nhập không hợp lệ";
            }

            if (Double.parseDouble(tongTien) > Double.parseDouble(tienKhachDua)) {
                return "Tiền khách đưa phải lớn hơn tổng tiền";
            }
        } catch (NumberFormatException e) {
            return "Số tiền nhập không hợp lệ";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String saveAll(String maHoaDon, LinkedHashMap<String, SanPhamDaChonViewModel> listSP) {
        HoaDon hoaDon = REPO_HD.getOneByMa(maHoaDon);
        listSP.forEach((t, u) -> {
            ChiTietSanPham chiTietSanPham = REPO_SP.getOne(ChiTietSanPham.builder().id(t).build());
            HoaDonchiTiet hoaDonchiTiet = HoaDonchiTiet.builder().IdChiTietSP(chiTietSanPham).IdHoaDon(hoaDon).
                    donGia(u.thanhTien()).soLuong(u.getSoLuong()).build();
            REPO_HDCT.save(hoaDonchiTiet);
            chiTietSanPham.setSoLuongTon(chiTietSanPham.getSoLuongTon() - u.getSoLuong());
            REPO_SP.update(chiTietSanPham);
        });
        hoaDon.setTinhTrang(TrangThaiHoaDon.DA_THANH_TOAN);
        REPO_HD.update(hoaDon);
        return "";
    }

    @Override
    public LinkedHashMap<String, SanPhamDaChonViewModel> getSanPhamDaChonByMaHD(String id) {

        Map<String, SanPhamDaChonViewModel> map = REPO_HDCT.getAllByIdHoaDon(id)
                .stream().map(t -> ConvertViewModel.getSanPhamDaChonViewModel(t))
                .collect(Collectors.toMap(SanPhamDaChonViewModel::getId, Function.identity()));
        return new LinkedHashMap<>(map);

    }

    public static void main(String[] args) {
        ChiTietHoaDonService cthds = new HoaDonChiTietServiceImpl();
        LinkedHashMap<String, SanPhamDaChonViewModel> hashMap = cthds.getSanPhamDaChonByMaHD("HD202210924");
        System.out.println(hashMap);
    }
}
