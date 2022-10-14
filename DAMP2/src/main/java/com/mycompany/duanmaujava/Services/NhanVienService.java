/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author acer
 */
public interface NhanVienService {

    List<NhanVien> getAll();

    String save(NhanVien t);

    NhanVien getOne(NhanVien t);
}
