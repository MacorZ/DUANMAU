/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import com.mycompany.duanmaujava.DomainModels.GetObject;

/**
 *
 * @author acer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SanPhamDaChonViewModel implements GetObject {

    private String id;
    private String ma;
    private String ten;
    private int soLuong;
    private BigDecimal donGia;

    public BigDecimal thanhTien() {
        return donGia.multiply(BigDecimal.valueOf(soLuong));
    }

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, ma, ten, soLuong, donGia + " VNĐ", thanhTien() + " VNĐ",id
        };
    }
}
