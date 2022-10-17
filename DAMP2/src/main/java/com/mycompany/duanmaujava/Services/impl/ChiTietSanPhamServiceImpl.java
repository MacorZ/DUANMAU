/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.HoaDonChiTietRepository;
import com.mycompany.duanmaujava.Repositories.SanPhamRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.HoaDonChiTietRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.SanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Services.ChiTietSanPhamService;
import com.mycompany.duanmaujava.Utilities.Validate;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author acer
 */
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {

    private static final ChiTietSanPhamRepository REPO_CTSP = new ChiTietSanPhamRepositoryImpl();
    private static final HoaDonChiTietRepository HOA_DON_CHI_TIET_REPOSITORY = new HoaDonChiTietRepositoryImpl();

    @Override
    public List<ChiTietSanPhamViewModel> getAll() {
        return REPO_CTSP.getList().stream().map(t -> ConvertViewModel.getChiTietSanPhamViewModel(t)).toList();
    }

    @Override
    public String save(ChiTietSanPham t) {
        REPO_CTSP.save(t);
        return "";
    }

    @Override
    public ChiTietSanPham getOne(ChiTietSanPham t) {
        return REPO_CTSP.getOne(t);

    }

    @Override
    public String updateChiTietSanPham(ChiTietSanPham t) {
        REPO_CTSP.update(t);
        return "";
    }

    @Override
    public LinkedHashMap<String, SanPhamDaChonViewModel> addSanPhamVaoGioHang(LinkedHashMap<String, SanPhamDaChonViewModel> gioHang, ChiTietSanPhamViewModel chiTietSanPhamResponse, int soLuong) {
        ChiTietSanPham chiTietSanPham = REPO_CTSP.getOne(ChiTietSanPham.builder().id(chiTietSanPhamResponse.getId()).build());
        SanPhamDaChonViewModel sanPhamDaChonResponse = ConvertViewModel.getSanPhamDaChonReponse(chiTietSanPham);
        sanPhamDaChonResponse.setSoLuong(soLuong);
        gioHang.put(chiTietSanPhamResponse.getId(), sanPhamDaChonResponse);
        return gioHang;
    }

    @Override
    public String validateSoLuong(String soLuongNhap, int soLuongTon) {
        try {
            if (!Validate.checkEmtry(soLuongNhap)) {
                return "Chưa nhập số lượng";
            }
            if (!Validate.checkFormatSmallerThanRezo(Double.parseDouble(soLuongNhap))) {
                return "Số lượng phải lớn hơn 0";
            }
            int soLuong = Integer.parseInt(soLuongNhap);
            if (soLuong > soLuongTon) {
                return "Số lượng nhập không được lớn hơn số lượng có trong gian hàng";
            }
        } catch (NumberFormatException e) {
            return "Số lượng nhập không hợp lệ";
        }
        return "";
    }

    @Override
    public BigDecimal getTongTien(LinkedHashMap<String, SanPhamDaChonViewModel> list) {
        return list.values().stream().map(u -> u.thanhTien()).reduce(BigDecimal.ZERO, BigDecimal::add);

    }

    @Override
    public List<ChiTietSanPhamViewModel> getListByTenSP(String tenSP, List<ChiTietSanPhamViewModel> list) {

        return list.stream().filter((t) -> (t.getSanPham().getTen().indexOf(tenSP) >= 0)).toList();

    }

    @Override
    public List<ChiTietSanPham> getList() {
        return REPO_CTSP.getList();
    }

    public static void main(String[] args) {
        ChiTietSanPhamService chiTietSanPhamService = new ChiTietSanPhamServiceImpl();
        System.out.println(chiTietSanPhamService.getList());
    }

    @Override
    public String delete(ChiTietSanPham t) {
        if (!HOA_DON_CHI_TIET_REPOSITORY.getByIdChiTietSanPham(t.getId())) {
            return "Sản phẩm không thể xóa vì đã tồn tại trong hóa đơn";
        }
        REPO_CTSP.delete(t);
        return "";
    }

    @Override
    public List<ChiTietSanPham> getByTenSP(String ten) {
        return REPO_CTSP.getByTenSP(ten);
    }
}
