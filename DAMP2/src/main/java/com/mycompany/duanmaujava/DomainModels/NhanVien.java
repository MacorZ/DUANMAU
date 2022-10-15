/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.DomainModels;

import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiNhanVien;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "NhanVien")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien implements Serializable {

    @Id
    @Column(name = "Id", nullable = false, columnDefinition = "uniqueidentifier")
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    @Nationalized
    private String ten;
    @Column(name = "TenDem")
    @Nationalized
    private String tenDem;
    @Column(name = "Ho")
    @Nationalized
    private String ho;
    @Column(name = "GioiTinh")
    @Nationalized
    private String gioiTinh;
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "DiaChi")
    @Nationalized
    private String diaChi;
    @Column(name = "Sdt")
    private String soDT;
    @Column(name = "MatKhau")
    private String matKhau;
    @ManyToOne
    @JoinColumn(name = "IdCH")
    private CuaHang cuaHang;
    @ManyToOne
    @JoinColumn(name = "IdCV")
    private ChucVu chucVu;
    @ManyToOne
    @JoinColumn(name = "IdGuiBC")
    private NhanVien nhanVien;
    @Column(name = "TrangThai")
    @Enumerated(EnumType.ORDINAL)
    private TrangThaiNhanVien trangThai;

}
