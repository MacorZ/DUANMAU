/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.NhanVien;
import com.mycompany.duanmaujava.Repositories.NhanVienRepository;
import com.mycompany.duanmaujava.Repositories.impl.NhanVienRepositoryImpl;
import com.mycompany.duanmaujava.Services.NhanVienService;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhanVienServiceImpl implements NhanVienService {

    private static final NhanVienRepository REPO = new NhanVienRepositoryImpl();

    @Override
    public List<NhanVien> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String save(NhanVien t) {
        REPO.save(t);
        return "";
    }

    @Override
    public NhanVien getOne(NhanVien t) {
        return REPO.getOne(t);
    }

}
