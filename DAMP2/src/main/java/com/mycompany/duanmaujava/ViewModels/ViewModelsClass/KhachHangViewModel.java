/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import com.mycompany.duanmaujava.DomainModels.GetObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class KhachHangViewModel implements GetObject {

    private String id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String soDT;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private Date ngaySinh;
    private String matKhau;

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(ngaySinh);

    }

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            ma, ho + " " + tenDem + " " + ten, getDate(), soDT, diaChi, thanhPho, quocGia, matKhau
        };
    }

}
