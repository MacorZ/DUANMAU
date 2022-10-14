/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.DongSP;
import java.util.List;

/**
 *
 * @author acer
 */
public interface DongSanPhamRepository {

    List<DongSP> getList();

    DongSP save(DongSP dongSP);

    DongSP update(DongSP dongSP);

    boolean delete(DongSP dongSP);

    DongSP getOneById(String id);

    boolean checkSave(String ma);

    boolean checkUpdate(String ma, String id);

    List<DongSP> getListByTen(String ten);
}
