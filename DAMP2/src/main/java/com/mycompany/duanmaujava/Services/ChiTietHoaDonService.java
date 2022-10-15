/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.HoaDonchiTiet;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChiTietHoaDonService {

    List<HoaDonchiTiet> getAll();

    String save(HoaDonchiTiet t);

    String saveAll(String maHoaDon, LinkedHashMap<String, SanPhamDaChonViewModel> listSP);

    HoaDonchiTiet getOne(HoaDonchiTiet t);

    String getTienThua(String tienKhachDua, String tongTien);

    LinkedHashMap<String,SanPhamDaChonViewModel> getSanPhamDaChonByMaHD(String id);
    
}
