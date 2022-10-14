/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.GioHang;
import java.util.List;

/**
 *
 * @author acer
 */
public interface GioHangRepository {
    List<GioHang> getAll();

    GioHang getOne(GioHang t);

    GioHang save(GioHang t);

    GioHang update(GioHang t);

    boolean delete(GioHang t);
}
