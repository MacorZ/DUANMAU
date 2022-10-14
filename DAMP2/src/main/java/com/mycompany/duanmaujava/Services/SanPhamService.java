/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.SanPham;
import java.util.List;

/**
 *
 * @author acer
 */
public interface SanPhamService {

    List<SanPham> getList();

    List<SanPham> getListByTen(String ten);

    SanPham getOneById(String id);

    String save(SanPham sp);

    String update(SanPham sp);

    String delete(SanPham sp);
}
