/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.text.SimpleDateFormat;
import com.mycompany.duanmaujava.DomainModels.GetObject;

/**
 *
 * @author acer
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonViewModel implements GetObject {

    private String id;
    private String maHD;
    private Date ngayTao;
    private String hoNV;
    private String tenDemNV;
    private String tenNV;
    private TrangThaiHoaDon trangThaiHoaDon;

    public String getTT() {
        return trangThaiHoaDon == TrangThaiHoaDon.CHO_THANH_TOAN ? "Chờ thanh toán"
                : (trangThaiHoaDon == TrangThaiHoaDon.DA_THANH_TOAN ? "Đã thanh toán" : "Đã hủy");
    }

    public String getHoTen() {
        return hoNV + " " + tenDemNV + " " + tenNV;
    }

    public String getNgayTao() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(ngayTao);
    }

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, maHD, getNgayTao(), getHoTen(), getTT()
        };
    }

}
