/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import com.mycompany.duanmaujava.DomainModels.GetObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CuaHangViewModel implements GetObject {

    private String id;
    private String ma;
    private String ten;
    private String diaChi;
    private String thanhPho;
    private String quocGia;

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, ma, ten, diaChi, thanhPho, quocGia
        };
    }
}
