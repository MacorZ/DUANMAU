/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelMapping;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;

/**
 *
 * @author acer
 */
public class MappingResponse {

    public static SanPhamDaChonViewModel getSanPhamDaChonReponse(ChiTietSanPham chiTietSanPham) {
        return SanPhamDaChonViewModel.builder().id(chiTietSanPham.getId()).ma(chiTietSanPham.getSanPham().getMa()).ten(chiTietSanPham.getSanPham().getTen())
                .donGia(chiTietSanPham.getGiaBan()).build();
    }

}
