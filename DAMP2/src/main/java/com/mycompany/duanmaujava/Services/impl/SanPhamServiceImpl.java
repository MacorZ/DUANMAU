/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.SanPham;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.SanPhamRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.SanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Services.SanPhamService;
import java.util.List;

/**
 *
 * @author acer
 */
public class SanPhamServiceImpl implements SanPhamService {

    private static final SanPhamRepository SAN_PHAM_REPOSITORY = new SanPhamRepositoryImpl();
    private static final ChiTietSanPhamRepository CHI_TIET_SAN_PHAM_REPOSITORY = new ChiTietSanPhamRepositoryImpl();

    @Override
    public List<SanPham> getList() {
        return SAN_PHAM_REPOSITORY.getAll();
    }

    @Override
    public SanPham getOneById(String id) {
        return SAN_PHAM_REPOSITORY.getOne(SanPham.builder().id(id).build());
    }

    @Override
    public String save(SanPham sp) {
        if (!SAN_PHAM_REPOSITORY.checkSave(sp.getMa())) {
            return "Mã sản phẩm đã tồn tại";
        }
        SAN_PHAM_REPOSITORY.save(sp);
        return "";
    }

    @Override
    public String update(SanPham sp) {
        if (!SAN_PHAM_REPOSITORY.checkUpdate(sp.getMa(), sp.getId())) {
            return "Mã sản phẩm đã tồn tại";
        }
        SAN_PHAM_REPOSITORY.update(sp);
        return "";
    }

    @Override
    public String delete(SanPham sp) {
        if (CHI_TIET_SAN_PHAM_REPOSITORY.getByIdSanPham(sp.getId()) != null) {
            return "Không thể xóa vì sản phẩm đã có dữ liệu ở chi tiết sản phẩm ";
        }
        return SAN_PHAM_REPOSITORY.delete(sp) ? "" : "Xóa thất bại";
    }

    @Override
    public List<SanPham> getListByTen(String ten) {
        return SAN_PHAM_REPOSITORY.getListByTen(ten);
    }

}
