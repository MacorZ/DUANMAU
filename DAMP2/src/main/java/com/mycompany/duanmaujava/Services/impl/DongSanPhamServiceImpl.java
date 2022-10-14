/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.DongSP;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.DongSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.DongSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Services.DongSanPhamService;
import java.util.List;

/**
 *
 * @author acer
 */
public class DongSanPhamServiceImpl implements DongSanPhamService {

    private static final DongSanPhamRepository DONG_SAN_PHAM_REPOSITORY = new DongSanPhamRepositoryImpl();
    private static final ChiTietSanPhamRepository CHI_TIET_SAN_PHAM_REPOSITORY = new ChiTietSanPhamRepositoryImpl();

    @Override
    public List<DongSP> getList() {
        return DONG_SAN_PHAM_REPOSITORY.getList();
    }

    @Override
    public DongSP getOneById(String id) {
        return DONG_SAN_PHAM_REPOSITORY.getOneById(id);
    }

    @Override
    public String save(DongSP dongSP) {
        if (!DONG_SAN_PHAM_REPOSITORY.checkSave(dongSP.getMa())) {
            return "Mã dòng sản phẩm đã tồn tại";
        }
        DONG_SAN_PHAM_REPOSITORY.save(dongSP);
        return "";
    }

    @Override
    public String update(DongSP dongSP) {
        if (!DONG_SAN_PHAM_REPOSITORY.checkUpdate(dongSP.getMa(), dongSP.getId())) {
            return "Mã dòng sản phẩm đã tồn tại";
        }
        DONG_SAN_PHAM_REPOSITORY.update(dongSP);
        return "";
    }

    @Override
    public String delete(DongSP dongSP) {
        if (CHI_TIET_SAN_PHAM_REPOSITORY.getByIdDongSP(dongSP.getId()) != null) {
            return "Không thể xóa dòng sản phẩm này vì đã tồn tại trong bảng chi tiết sản phẩm";
        }
        return DONG_SAN_PHAM_REPOSITORY.delete(dongSP) ? "" : "Xóa thất bại";
    }

    @Override
    public List<DongSP> getListByTen(String ten) {
        return DONG_SAN_PHAM_REPOSITORY.getListByTen(ten);
    }

}
