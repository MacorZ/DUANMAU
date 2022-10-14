/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.NhaSanXuat;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.NhaSanXuatRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.NhaSanXuatRepositoryImpl;
import com.mycompany.duanmaujava.Services.NhaSanXuatService;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhaSanXuatServiceImpl implements NhaSanXuatService {

    private static final NhaSanXuatRepository NHA_SAN_XUAT_REPOSITORY = new NhaSanXuatRepositoryImpl();
    private static final ChiTietSanPhamRepository CHI_TIET_SAN_PHAM_REPOSITORY = new ChiTietSanPhamRepositoryImpl();

    @Override
    public List<NhaSanXuat> getList() {
        return NHA_SAN_XUAT_REPOSITORY.getList();
    }

    @Override
    public NhaSanXuat getOneById(String id) {
        return NHA_SAN_XUAT_REPOSITORY.getOneById(id);
    }

    @Override
    public String save(NhaSanXuat nsx) {
        if (!NHA_SAN_XUAT_REPOSITORY.checkSave(nsx.getMa())) {
            return "Mã nhà sản xuất đã tồn tại";
        }
        NHA_SAN_XUAT_REPOSITORY.save(nsx);
        return "";
    }

    @Override
    public String update(NhaSanXuat nsx) {
        if (!NHA_SAN_XUAT_REPOSITORY.checkUpdate(nsx.getMa(), nsx.getId())) {
            return "Mã nhà sản xuất đã tồn tại";
        }
        NHA_SAN_XUAT_REPOSITORY.update(nsx);
        return "";
    }

    @Override
    public String delete(NhaSanXuat nsx) {
        if (CHI_TIET_SAN_PHAM_REPOSITORY.getByIdNhaSX(nsx.getId()) != null) {
            return "Không thể xóa nhà sản xuất này vì đã tồn tại trong bảng chi tiết sản phẩm";
        }
        return NHA_SAN_XUAT_REPOSITORY.delete(nsx) ? "" : "Xóa thất bại";
    }

    @Override
    public List<NhaSanXuat> getListByTen(String ten) {
        return NHA_SAN_XUAT_REPOSITORY.getListByTen(ten);
    }

}
