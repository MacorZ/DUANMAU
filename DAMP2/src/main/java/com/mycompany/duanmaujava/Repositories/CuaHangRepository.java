/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.CuaHang;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.CuaHangViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface CuaHangRepository {

    List<CuaHang> getList();

    CuaHang getOneById(String id);

    boolean checkSave(String ma);

    boolean checkUpdate(String ma, String id);

    boolean checkDelete(String id);

    boolean save(CuaHang ch);

    boolean update(CuaHang ch);

    boolean delete(CuaHang ch);
}
