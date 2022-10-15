/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.ChucVu;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChucVuRepository {

    List<ChucVu> getList();

    ChucVu getOneById(String id);

    boolean checkSave(String ma);

    boolean checkUpdate(String ma, String id);

    boolean checkDelete(String id);

    boolean save(ChucVu chucVu);

    boolean update(ChucVu chucVu);

    boolean delete(ChucVu chucVu);

}
