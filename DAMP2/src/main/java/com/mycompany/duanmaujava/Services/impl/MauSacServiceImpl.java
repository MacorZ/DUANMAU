/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.MauSac;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Repositories.MauSacRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChiTietSanPhamRepositoryImpl;
import com.mycompany.duanmaujava.Repositories.impl.MauSacRepositoryImpl;
import com.mycompany.duanmaujava.Services.MauSacService;
import java.util.List;

/**
 *
 * @author acer
 */
public class MauSacServiceImpl implements MauSacService {

    private static final MauSacRepository MAU_SAC_REPOSITORY = new MauSacRepositoryImpl();
    private static final ChiTietSanPhamRepository CHI_TIET_SAN_PHAM_REPOSITORY = new ChiTietSanPhamRepositoryImpl();

    @Override
    public List<MauSac> getList() {
        return MAU_SAC_REPOSITORY.getList();
    }

    @Override
    public MauSac getOneById(String id) {
        return MAU_SAC_REPOSITORY.getOneById(id);
    }

    @Override
    public String save(MauSac ms) {
        if (!MAU_SAC_REPOSITORY.checkSave(ms.getMa())) {
            return "Mã màu đã tồn tại";
        }
        MAU_SAC_REPOSITORY.save(ms);
        return "";
    }

    @Override
    public String update(MauSac ms) {
        if (!MAU_SAC_REPOSITORY.checkUpdate(ms.getMa(), ms.getId())) {
            return "Mã màu đã tồn tại";
        }
        MAU_SAC_REPOSITORY.update(ms);
        return "";
    }

    @Override
    public String delete(MauSac ms) {
        if (CHI_TIET_SAN_PHAM_REPOSITORY.getByIdMauSac(ms.getId()) != null) {
            return "Không thể xóa màu sắc này vì đã tồn tại trong bảng chi tiết sản phẩm";
        }
        return MAU_SAC_REPOSITORY.delete(ms) ? "" : "Xóa thất bại";
    }

    @Override
    public List<MauSac> getListByTen(String ten) {
        return MAU_SAC_REPOSITORY.getListByTen(ten);
    }

}
