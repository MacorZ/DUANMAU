/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.HoaDonchiTiet;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface HoaDonChiTietRepository {
    List<HoaDonchiTiet> getAll();

    HoaDonchiTiet getOne(HoaDonchiTiet t);

    HoaDonchiTiet save(HoaDonchiTiet t);

    HoaDonchiTiet update(HoaDonchiTiet t);

    boolean delete(HoaDonchiTiet t);
    
    List<SanPhamDaChonViewModel> getSanPhamDaChonByMaHD(String id);
    
    boolean getByIdChiTietSanPham(String id);
}
