/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelsClass;

import com.mycompany.duanmaujava.DomainModels.GetObject;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiNhanVien;
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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NhanVienViewModel implements GetObject {

    private String id;
    private String ma;
    private String ten;
    private String tenDem;
    private String ho;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String soDT;
    private String matKhau;
    private CuaHangViewModel cuaHang;
    private ChucVuViewModel chucVu;
    private String idBC;
    private String tenBC;
    private TrangThaiNhanVien trangThai;

    public String getDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(ngaySinh);

    }

    public String getHoTenNV() {
        return ho + " " + tenDem + " " + ten;
    }

    public String getGuiBC() {
        return idBC == null ? "Trống" : tenBC;
    }

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, ma, getHoTenNV(), gioiTinh, getDate(), diaChi, matKhau, soDT, cuaHang.getTen(), chucVu.getTen(), getGuiBC(), trangThai.getTT()
        };
    }

    @Override
    public String toString() {
        return getHoTenNV();
    }

}
