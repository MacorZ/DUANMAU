/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.NhaSanXuat;
import java.util.List;

/**
 *
 * @author acer
 */
public interface NhaSanXuatService {

    List<NhaSanXuat> getList();

    List<NhaSanXuat> getListByTen(String ten);

    NhaSanXuat getOneById(String id);

    String save(NhaSanXuat nsx);

    String update(NhaSanXuat nsx);

    String delete(NhaSanXuat nsx);
}
