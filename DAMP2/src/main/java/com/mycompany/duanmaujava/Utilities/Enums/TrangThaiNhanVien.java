/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.duanmaujava.Utilities.Enums;

/**
 *
 * @author acer
 */
public enum TrangThaiNhanVien {
    DANG_LAM_VIEC, DANG_NGHI;

    public String getTT() {
        return this == DANG_LAM_VIEC ? "Đang làm việc" : "Đang nghỉ";
    }
}

