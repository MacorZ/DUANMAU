/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface HoaDonService {

    List<HoaDonViewModel> getAll();

    String save(HoaDonViewModel t);

    HoaDon getOne(HoaDonViewModel t);

    List<HoaDonViewModel> getAllByTrangThai(TrangThaiHoaDon trangThaiHoaDon);

}
