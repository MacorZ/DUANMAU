/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.DomainModels;


import java.io.Serializable;
import lombok.Data;


/**
 *
 * @author acer
 */
@Data
public class GioHangChiTietId implements Serializable{

    private String IdGioHang;

    private String IdChiTietSP;
}
