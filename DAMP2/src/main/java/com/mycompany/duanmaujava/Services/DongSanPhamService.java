/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.DongSP;
import java.util.List;

/**
 *
 * @author acer
 */
public interface DongSanPhamService {

    List<DongSP> getList();

    List<DongSP> getListByTen(String ten);

    DongSP getOneById(String id);

    String save(DongSP dongSP);

    String update(DongSP dongSP);

    String delete(DongSP dongSP);
}
