/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.KhachHang;
import com.mycompany.duanmaujava.Repositories.KhachHangRepository;
import com.mycompany.duanmaujava.Repositories.impl.KhachHangRepositoryImpl;
import com.mycompany.duanmaujava.Services.KhachHangService;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public class KhachHangServiceImpl implements KhachHangService {

    private static final KhachHangRepository KHACH_HANG_REPOSITORY = new KhachHangRepositoryImpl();

    @Override
    public List<KhachHangViewModel> getList() {
        return KHACH_HANG_REPOSITORY.getList().stream().map(t -> ConvertViewModel.getKhachHangViewModel(t)).toList();
    }

    @Override
    public String save(KhachHangViewModel hangViewModel) {
        KhachHang kh = ConvertViewModel.getKhachHang(hangViewModel);
        if (!KHACH_HANG_REPOSITORY.checkSave(kh.getMa())) {
            return "Mã không được trùng";
        }
        return KHACH_HANG_REPOSITORY.save(kh) ? "" : "Thêm thất bại";
    }

    @Override
    public String update(KhachHangViewModel hangViewModel) {
        KhachHang kh = ConvertViewModel.getKhachHang(hangViewModel);
        if (!KHACH_HANG_REPOSITORY.checkUpdate(kh.getMa(),kh.getId())) {
            return "Mã không được trùng";
        }
        return KHACH_HANG_REPOSITORY.update(kh) ? "" : "Cập nhật thất bại";
    }

    @Override
    public String delete(KhachHangViewModel hangViewModel) {
        KhachHang kh = ConvertViewModel.getKhachHang(hangViewModel);
        if (!KHACH_HANG_REPOSITORY.checkDelete(kh.getId())) {
            return "Khoong ";
        }
        return KHACH_HANG_REPOSITORY.delete(kh) ? "" : "Xóa thất bại";
    }

}
