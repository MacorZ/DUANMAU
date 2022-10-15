/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.HoaDonchiTiet;
import com.mycompany.duanmaujava.Repositories.HoaDonChiTietRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonViewModel;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class HoaDonChiTietRepositoryImpl implements HoaDonChiTietRepository {

    @Override
    public List<HoaDonchiTiet> getAll() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "select hd from HoaDonchiTiet hd";
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public HoaDonchiTiet getOne(HoaDonchiTiet t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDonchiTiet save(HoaDonchiTiet t) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return t;
    }

    @Override
    public HoaDonchiTiet update(HoaDonchiTiet t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(HoaDonchiTiet t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPhamDaChonViewModel> getSanPhamDaChonByMaHD(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = """
                         select new com.mycompany.duanmaujava.ViewModels.ViewModelsClass.SanPhamDaChonResponse
                         (hdct.IdChiTietSP.id,hdct.IdChiTietSP.sanPham.ma,hdct.IdChiTietSP.sanPham.ten,hdct.soLuong,hdct.IdChiTietSP.giaBan)
                         from HoaDonchiTiet hdct where hdct.IdHoaDon.id = :id
                         """;
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean getByIdChiTietSanPham(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "select hd from HoaDonchiTiet hd where hd.IdChiTietSP.id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            if (!query.getResultList().isEmpty()) {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

}
