/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.Repositories.NhanVienRepository;
import com.mycompany.duanmaujava.Repositories.impl.NhanVienRepositoryImpl;
import com.mycompany.duanmaujava.Services.NhanVienService;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertClass;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhanVienServiceImpl implements NhanVienService {

    private static final NhanVienRepository NHAN_VIEN_REPOSITORY = new NhanVienRepositoryImpl();

    @Override
    public List<NhanVienViewModel> getList() {
        return NHAN_VIEN_REPOSITORY.getList().stream().map(t -> ConvertClass.getNhanVienViewModel(t)).toList();
    }

    @Override
    public String save(NhanVienViewModel t) {
        if (!NHAN_VIEN_REPOSITORY.checkSave(t.getMa())) {
            return "Mã không được trùng";
        }
        return NHAN_VIEN_REPOSITORY.save(ConvertClass.getNhanVien(t)) ? "" : "Thêm thất bại";
    }

    @Override
    public NhanVienViewModel getOneById(String id) {
        return ConvertClass.getNhanVienViewModel(NHAN_VIEN_REPOSITORY.getOneById(id));
    }

    @Override
    public String update(NhanVienViewModel t) {
        if (!NHAN_VIEN_REPOSITORY.checkUpdate(t.getMa(), t.getId())) {
            return "Mã không được trùng";
        }
        return NHAN_VIEN_REPOSITORY.update(ConvertClass.getNhanVien(t)) ? "" : "Cập nhật thất bại";
    }

    @Override
    public String delete(NhanVienViewModel t) {
        if (!NHAN_VIEN_REPOSITORY.checkDelete(t.getId())) {
            return "Không thể xóa nhân viên này";
        }
        return NHAN_VIEN_REPOSITORY.delete(ConvertClass.getNhanVien(t)) ? "" : "Xóa thất bại";
    }

    @Override
    public NhanVienViewModel getOneByMa(String ma) {
        return ConvertClass.getNhanVienViewModel(NHAN_VIEN_REPOSITORY.getOneByMa(ma));
    }

    @Override
    public List<NhanVienViewModel> getListGuiBC() {
        return NHAN_VIEN_REPOSITORY.getListGuiBC().stream().map(t -> ConvertClass.getNhanVienViewModel(t)).toList();
    }

    public static void main(String[] args) {
        NhanVienService nhanVienService = new NhanVienServiceImpl();
        System.out.println(nhanVienService.getList());
    }
}
