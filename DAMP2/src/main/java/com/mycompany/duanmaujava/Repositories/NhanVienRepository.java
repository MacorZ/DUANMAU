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

    List<NhanVien> getList();

    NhanVien getOneById(String id);

    NhanVien getOneByMa(String ma);

    boolean save(NhanVien t);

    boolean update(NhanVien t);

    boolean delete(NhanVien t);

    boolean checkSave(String ma);

    boolean checkUpdate(String ma, String id);

    boolean checkDelete(String id);

}
