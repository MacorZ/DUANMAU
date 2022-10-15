/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author acer
 */
public interface NhanVienRepository {
    List<NhanVien> getAll();

    NhanVien getOne(NhanVien t);

    NhanVien save(NhanVien t);

    NhanVien update(NhanVien t);

    boolean delete(NhanVien t);
    
    
}
