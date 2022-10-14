/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author acer
 */
public interface GioHangChiTietRepository {
    List<GioHangChiTiet> getAll();

    GioHangChiTiet getOne(GioHangChiTiet t);

    GioHangChiTiet save(GioHangChiTiet t);

    GioHangChiTiet update(GioHangChiTiet t);

    boolean delete(GioHangChiTiet t);
}
