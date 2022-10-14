/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.GioHang;
import java.util.List;

/**
 *
 * @author acer
 */
public interface GioHangService {

    List<GioHang> getAll();

    String save(GioHang t);

    GioHang getOne(GioHang t);
}
