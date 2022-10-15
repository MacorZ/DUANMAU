/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChiTietSanPhamRepository {

    List<ChiTietSanPhamViewModel> getAll();

    ChiTietSanPham getOne(ChiTietSanPham t);

    ChiTietSanPham save(ChiTietSanPham t);

    ChiTietSanPham update(ChiTietSanPham t);

    boolean delete(ChiTietSanPham t);

    List<ChiTietSanPham> getList();

    List<ChiTietSanPham> getByTenSP(String ten);

    ChiTietSanPham getByIdSanPham(String id);

    ChiTietSanPham getByIdDongSP(String id);

    ChiTietSanPham getByIdNhaSX(String id);

    ChiTietSanPham getByIdMauSac(String id);

}
