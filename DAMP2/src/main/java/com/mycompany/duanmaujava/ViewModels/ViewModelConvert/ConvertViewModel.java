/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.ViewModels.ViewModelConvert;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.DomainModels.ChucVu;
import com.mycompany.duanmaujava.DomainModels.CuaHang;
import com.mycompany.duanmaujava.DomainModels.DongSP;
import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.DomainModels.MauSac;
import com.mycompany.duanmaujava.DomainModels.NhaSanXuat;
import com.mycompany.duanmaujava.DomainModels.NhanVien;
import com.mycompany.duanmaujava.DomainModels.SanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChucVuViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.CuaHangViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.DongSanPhamViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.MauSacViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.NhanVienViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamViewModel;

/**
 *
 * @author acer
 */
public class ConvertViewModel {

    public static SanPhamDaChonViewModel getSanPhamDaChonReponse(ChiTietSanPham chiTietSanPham) {
        return SanPhamDaChonViewModel.builder().id(chiTietSanPham.getId()).ma(chiTietSanPham.getSanPham().getMa()).ten(chiTietSanPham.getSanPham().getTen())
                .donGia(chiTietSanPham.getGiaBan()).build();
    }

    public static NhanVienViewModel getNhanVienViewModel(NhanVien nhanVien) {
        return NhanVienViewModel.builder().id(nhanVien.getId()).ma(nhanVien.getMa()).ten(nhanVien.getTen()).
                tenDem(nhanVien.getTenDem()).ho(nhanVien.getHo()).ngaySinh(nhanVien.getNgaySinh()).diaChi(nhanVien.getDiaChi()).
                gioiTinh(nhanVien.getGioiTinh()).soDT(nhanVien.getSoDT()).matKhau(nhanVien.getMatKhau())
                .chucVu(getChucVuViewModel(nhanVien.getChucVu()))
                .cuaHang(getCuaHangViewModel(nhanVien.getCuaHang())).nhanVien(getNhanVienViewModel(nhanVien.getNhanVien()))
                .trangThai(nhanVien.getTrangThai()).build();
    }

    public static ChucVuViewModel getChucVuViewModel(ChucVu chucVu) {
        return new ChucVuViewModel(chucVu.getId(), chucVu.getMa(), chucVu.getTen());
    }

    public static CuaHangViewModel getCuaHangViewModel(CuaHang cuaHang) {
        return new CuaHangViewModel(cuaHang.getId(), cuaHang.getMa(), cuaHang.getTen(), cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia());
    }

    public static CuaHang getCuaHang(CuaHangViewModel cuaHangViewModel) {
        return CuaHang.builder().ma(cuaHangViewModel.getMa())
                .ten(cuaHangViewModel.getTen()).diaChi(cuaHangViewModel.getDiaChi()).
                thanhPho(cuaHangViewModel.getThanhPho()).quocGia(cuaHangViewModel.getQuocGia()).id(cuaHangViewModel.getId()).build();
    }

    public static ChucVu getChucVu(ChucVuViewModel chucVuViewModel) {
        return ChucVu.builder().ma(chucVuViewModel.getMa()).ten(chucVuViewModel.getTen()).id(chucVuViewModel.getId()).build();
    }

    public static NhanVien getNhanVien(NhanVienViewModel nhanVienViewModel) {
        return NhanVien.builder().id(nhanVienViewModel.getId()).ma(nhanVienViewModel.getMa()).ten(nhanVienViewModel.getTen()).tenDem(nhanVienViewModel.getTenDem()).
                ho(nhanVienViewModel.getHo()).gioiTinh(nhanVienViewModel.getGioiTinh()).ngaySinh(nhanVienViewModel.getNgaySinh()).matKhau(nhanVienViewModel.getMatKhau()).
                diaChi(nhanVienViewModel.getDiaChi()).soDT(nhanVienViewModel.getSoDT()).chucVu(getChucVu(nhanVienViewModel.getChucVu())).
                cuaHang(getCuaHang(nhanVienViewModel.getCuaHang())).nhanVien(getNhanVien(nhanVienViewModel.getNhanVien())).
                trangThai(nhanVienViewModel.getTrangThai()).build();
    }

    public static HoaDon getHoaDon(HoaDonViewModel hoaDonViewModel) {
        return HoaDon.builder().id(hoaDonViewModel.getId()).ma(hoaDonViewModel.getMa()).ngayTao(hoaDonViewModel.getNgayTao())
                .nhanVien(getNhanVien(hoaDonViewModel.getNhanVien())).tinhTrang(hoaDonViewModel.getTinhTrang()).build();
    }

    public static SanPhamViewModel getSanPhamViewModel(SanPham sanPham) {
            return 
    }

    public static NhanVienViewModel getNhaSanXuatViewModel(NhaSanXuat nhaSanXuat) {

    }

    public static MauSacViewModel getMauSacViewModel(MauSac mauSac) {

    }

    public static DongSanPhamViewModel getDongSanPhamViewModel(DongSP dongSP) {

    }

    public static getChiTietSanPhamViewModel(ChiTietSanPham chiTietSanPham) {
        return ChiTietSanPhamViewModel.builder().id(chiTietSanPham.getId()).sanPham(chiTietSanPham.getSanPham())
    }
}
