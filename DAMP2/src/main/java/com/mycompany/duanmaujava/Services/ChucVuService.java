/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.ChucVu;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChucVuViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChucVuService  {

    List<ChucVuViewModel> getList();

    ChucVuViewModel getOneById(String id);

    String save(ChucVuViewModel chucVu);

    String update(ChucVuViewModel chucVu);

    String delete(ChucVuViewModel chucVu);
}
