/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.NhanVien;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.NhanVienViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface NhanVienService {

    List<NhanVienViewModel> getList();

    String save(NhanVienViewModel t);

    String update(NhanVienViewModel t);

    String delete(NhanVienViewModel t);

    NhanVienViewModel getOneById(String id);
    
    NhanVienViewModel getOneByMa(String id);
}
