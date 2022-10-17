/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface HoaDonRepository {

    List<HoaDon> getAll();

    HoaDon getOne(HoaDon t);

    HoaDon getOneByMa(String ma);

    HoaDon save(HoaDon t);

    HoaDon update(HoaDon t);

    boolean delete(HoaDon t);

    List<HoaDon> getAllByTrangThai(TrangThaiHoaDon trangThaiHoaDon);
}
