/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Utilities;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author acer
 */
public class MaTuSinh {
    public static String genMaTuSinh(String kyTu){
        String ma = kyTu+new Date().getTime();
        return ma;
    }
    public static void main(String[] args) {

    }
}
