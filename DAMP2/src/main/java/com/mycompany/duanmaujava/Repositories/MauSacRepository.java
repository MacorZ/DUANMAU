/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author acer
 */
public interface MauSacRepository {

    List<MauSac> getList();

    MauSac save(MauSac dongSP);

    MauSac update(MauSac dongSP);

    boolean delete(MauSac dongSP);

    MauSac getOneById(String id);

    boolean checkSave(String ma);

    boolean checkUpdate(String ma, String id);

    List<MauSac> getListByTen(String ten);
}
