/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author acer
 */
public interface KhachHangService {

    List<KhachHangViewModel> getList();

    String save(KhachHangViewModel hangViewModel);

    String update(KhachHangViewModel hangViewModel);

    String delete(KhachHangViewModel hangViewModel);
}
