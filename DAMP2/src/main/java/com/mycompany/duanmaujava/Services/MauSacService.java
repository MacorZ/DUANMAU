/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author acer
 */
public interface MauSacService {

    List<MauSac> getList();

    List<MauSac> getListByTen(String ten);

    MauSac getOneById(String id);

    String save(MauSac ms);

    String update(MauSac ms);

    String delete(MauSac ms);
}
