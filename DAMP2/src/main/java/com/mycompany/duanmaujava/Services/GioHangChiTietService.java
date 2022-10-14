/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author acer
 */
public interface GioHangChiTietService {

    List<GioHangChiTiet> getAll();

    String save(GioHangChiTiet t);

    GioHangChiTiet getOne(GioHangChiTiet t);
}
