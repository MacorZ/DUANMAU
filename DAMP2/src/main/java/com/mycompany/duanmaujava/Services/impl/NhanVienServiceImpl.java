/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.Repositories.NhanVienRepository;
import com.mycompany.duanmaujava.Repositories.impl.NhanVienRepositoryImpl;
import com.mycompany.duanmaujava.Services.NhanVienService;
import com.mycompany.duanmaujava.ViewModels.ViewModelConvert.ConvertViewModel;
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
        return NHAN_VIEN_REPOSITORY.getList().stream().map(t -> ConvertViewModel.getNhanVienViewModel(t)).toList();
    }
    
    @Override
    public String save(NhanVienViewModel t) {
        
        return "";
    }
    
    @Override
    public NhanVienViewModel getOneById(String id) {
        return null;
    }
    
    @Override
    public String update(NhanVienViewModel t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String delete(NhanVienViewModel t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public NhanVienViewModel getOneByMa(String ma) {
        return ConvertViewModel.getNhanVienViewModel(NHAN_VIEN_REPOSITORY.getOneByMa(ma));
    }
    
}
