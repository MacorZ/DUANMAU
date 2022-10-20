/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.KhachHang;
import java.util.List;

/**
 *
 * @author acer
 */
public interface KhachHangRepository {

    List<KhachHang> getList();

    boolean save(KhachHang khachHang);

    boolean checkSave(String ma);

    boolean update(KhachHang khachHang);

    boolean checkUpdate(String ma, String id);

    boolean delete(KhachHang khachHang);

    boolean checkDelete(String id);
}
