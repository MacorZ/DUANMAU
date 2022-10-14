/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.DomainModels;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "KhachHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KhachHang implements Serializable{

    @Id
    @Column(name = "Id", nullable = false,columnDefinition="uniqueidentifier")
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
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    @Column(name = "Sdt")
    private String soDT;
    @Column(name = "DiaChi")
    @Nationalized
    private String diaChi;
    @Column(name = "ThanhPho")
    @Nationalized
    private String thanhPho;
    @Column(name = "QuocGia")
    private String quocGia;
    @Column(name = "MatKhau")
    private String matKhau;

}
