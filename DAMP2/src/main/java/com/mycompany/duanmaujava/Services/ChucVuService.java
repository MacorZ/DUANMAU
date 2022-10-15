/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.ChucVu;
import java.util.List;

/**
 *
 * @author acer
 */
public interface ChucVuService {

    List<ChucVu> getList();

    ChucVu getOneById(String id);

    String save(ChucVu chucVu);

    String update(ChucVu chucVu);

    String delete(ChucVu chucVu);
}
