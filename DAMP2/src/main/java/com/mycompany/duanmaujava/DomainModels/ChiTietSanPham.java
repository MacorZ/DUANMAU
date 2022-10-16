/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.DomainModels;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
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

/**
 *
 * @author acer
 */
@Entity
@Table(name = "ChiTietSP")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSanPham implements Serializable, GetObject {

    @Id
    @Column(name = "Id", nullable = false, columnDefinition = "uniqueidentifier")
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    private String id;
    @ManyToOne
    @JoinColumn(name = "idSP")
    private SanPham sanPham;
    @ManyToOne
    @JoinColumn(name = "idNSX")
    private NhaSanXuat nhaSanXuat;
    @ManyToOne
    @JoinColumn(name = "idMauSac")
    private MauSac mauSac;
    @ManyToOne
    @JoinColumn(name = "idDongSP")
    private DongSP dongSP;
    @Column(name = "NamBH")
    private int namBH;
    @Column(name = "MoTa")
    private String moTa;
    @Column(name = "SoLuongTon")
    private int soLuongTon;
    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
    @Column(name = "GiaBan")
    private BigDecimal giaBan;

    @Override
    public Object[] getObj(int i) {
        return new Object[]{
            i, sanPham.getMa(), sanPham.getTen(), nhaSanXuat.getTen(), mauSac.getTen(),
            dongSP.getTen(), namBH, moTa, soLuongTon, giaNhap, giaBan
        };
    }
    public static void main(String[] args) {
        String s = null;
        System.out.println("".equals(s));
        
    }
    
}
