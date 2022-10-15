/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.CuaHangViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface CuaHangService {

    List<CuaHangViewModel> getList();

    CuaHangViewModel getOneById(String id);

    String save(CuaHangViewModel cuaHangViewModel);

    String update(CuaHangViewModel cuaHangViewModel);

    String delete(CuaHangViewModel cuaHangViewModel);
}
