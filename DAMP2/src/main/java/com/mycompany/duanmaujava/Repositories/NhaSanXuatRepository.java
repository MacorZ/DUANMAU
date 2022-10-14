/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.NhaSanXuat;
import java.util.List;

/**
 *
 * @author acer
 */
public interface NhaSanXuatRepository {

    List<NhaSanXuat> getList();

    NhaSanXuat save(NhaSanXuat dongSP);

    NhaSanXuat update(NhaSanXuat dongSP);

    boolean delete(NhaSanXuat dongSP);

    NhaSanXuat getOneById(String id);

    boolean checkUpdate(String ma, String id);

    boolean checkSave(String ma);

    List<NhaSanXuat> getListByTen(String ten);
}
