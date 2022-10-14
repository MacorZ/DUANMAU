/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamResponse;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonResponse;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChiTietSanPhamService {

    List<ChiTietSanPhamResponse> getAll();

    String save(ChiTietSanPham t);

    ChiTietSanPham getOne(ChiTietSanPham t);
    
    String delete(ChiTietSanPham t);

    String updateChiTietSanPham(ChiTietSanPham t);

    LinkedHashMap<String, SanPhamDaChonResponse> addSanPhamVaoGioHang(LinkedHashMap<String, SanPhamDaChonResponse> gioHang, ChiTietSanPhamResponse chiTietSanPhamResponse, int soLuong);

    String validateSoLuong(String soLuongNhap, int soLuongTon);

    BigDecimal getTongTien(LinkedHashMap<String, SanPhamDaChonResponse> gioHang);

    List<ChiTietSanPhamResponse> getListByTenSP(String tenSP, List<ChiTietSanPhamResponse> list);
    
    List<ChiTietSanPham> getList();
    
    List<ChiTietSanPham> getByTenSP(String ten);

}
