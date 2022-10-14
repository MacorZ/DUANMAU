/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Services.impl;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.Repositories.HoaDonRepository;
import com.mycompany.duanmaujava.Repositories.impl.HoaDonRepositoryImpl;
import com.mycompany.duanmaujava.Services.HoaDonService;
import com.mycompany.duanmaujava.Services.ICommon;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonReponse;
import java.util.List;

/**
 *
 * @author acer
 */
public class HoaDonServiceImpl implements HoaDonService {

    private static final HoaDonRepository REPO = new HoaDonRepositoryImpl();

    @Override
    public List<HoaDonReponse> getAll() {
        return REPO.getAll();
    }

    @Override
    public String save(HoaDon t) {
        REPO.save(t);
        return "";
    }

    @Override
    public List<HoaDonReponse> getAllByTrangThai(TrangThaiHoaDon trangThaiHoaDon) {
        return REPO.getAllByTrangThai(trangThaiHoaDon);
    }

    @Override
    public HoaDon getOne(HoaDon t) {
            return REPO.getOne(t);
    }
}
