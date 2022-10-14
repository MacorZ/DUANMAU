/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author acer
 */
public interface SanPhamRepository {

    List<SanPham> getAll();

    SanPham getOne(SanPham t);

    SanPham save(SanPham t);

    SanPham update(SanPham t);

    boolean delete(SanPham t);

    List<SanPham> getListByTen(String ten);

    boolean checkUpdate(String ma, String id);

    boolean checkSave(String ma);

}
