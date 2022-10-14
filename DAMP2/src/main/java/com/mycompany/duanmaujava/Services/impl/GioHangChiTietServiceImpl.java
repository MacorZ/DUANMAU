/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.GioHangChiTiet;
import com.mycompany.duanmaujava.Repositories.impl.GioHangChiTietRepositoryImpl;
import com.mycompany.duanmaujava.Services.GioHangChiTietService;
import com.mycompany.duanmaujava.Services.ICommon;
import java.util.List;

/**
 *
 * @author acer
 */
public class GioHangChiTietServiceImpl implements GioHangChiTietService {

    private static final GioHangChiTietRepositoryImpl REPO = new GioHangChiTietRepositoryImpl();

    @Override
    public List<GioHangChiTiet> getAll() {
        return REPO.getAll();
    }

    @Override
    public String save(GioHangChiTiet e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public GioHangChiTiet getOne(GioHangChiTiet t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
