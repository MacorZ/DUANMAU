/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.ChucVu;
import com.mycompany.duanmaujava.Repositories.ChucVuRepository;
import com.mycompany.duanmaujava.Repositories.impl.ChucVuRepositoryImpl;
import com.mycompany.duanmaujava.Services.ChucVuService;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChucVuViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public class ChucVuServiceImpl implements ChucVuService {
    
    private static final ChucVuRepository CHUC_VU_REPOSITORY = new ChucVuRepositoryImpl();
    
    @Override
    public List<ChucVuViewModel> getList() {
        return CHUC_VU_REPOSITORY.getList().stream().map(t -> ConvertViewModel.getChucVuViewModel(t)).toList();
    }
    
    @Override
    public ChucVuViewModel getOneById(String id) {
        return null;
    }
    
    @Override
    public String save(ChucVuViewModel chucVu) {
        if (!CHUC_VU_REPOSITORY.checkSave(chucVu.getMa())) {
            return "Mã chức vụ đã tồn tại";
        }
        return CHUC_VU_REPOSITORY.save(ConvertViewModel.getChucVu(chucVu)) ? "" : "Thêm thất bại";
    }
    
    @Override
    public String update(ChucVuViewModel chucVu) {
        if (!CHUC_VU_REPOSITORY.checkUpdate(chucVu.getMa(), chucVu.getId())) {
            return "Mã chức vụ đã tồn tại";
        }
        return CHUC_VU_REPOSITORY.update(ConvertViewModel.getChucVu(chucVu)) ? "" : "Cập nhật thất bại";
    }
    
    @Override
    public String delete(ChucVuViewModel chucVu) {
        if (!CHUC_VU_REPOSITORY.checkDelete(chucVu.getId())) {
            return " Chức vụ này đã tồn tại trong nhân viên";
        }
        return CHUC_VU_REPOSITORY.delete(ConvertViewModel.getChucVu(chucVu)) ? "" : "Xóa thất bại";
    }
}
