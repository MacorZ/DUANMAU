/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.HoaDon;
import com.mycompany.duanmaujava.Repositories.HoaDonRepository;
import com.mycompany.duanmaujava.Utilities.Enums.TrangThaiHoaDon;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonViewModel;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class HoaDonRepositoryImpl implements HoaDonRepository {

    @Override
    public List<HoaDonViewModel> getAll() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = """
                         select new com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonReponse
                         (hd.id,hd.ma,hd.ngayTao,hd.nhanVien.ho,hd.nhanVien.tenDem,hd.nhanVien.ten,hd.tinhTrang)
                         from HoaDon hd
                         """;
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public HoaDon getOne(HoaDon t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            return session.get(HoaDon.class, t.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public HoaDon save(HoaDon t) {
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
    public HoaDon update(HoaDon t) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return t;
    }

    @Override
    public boolean delete(HoaDon t) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.delete(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
        return true;
    }

    @Override
    public List<HoaDonViewModel> getAllByTrangThai(TrangThaiHoaDon trangThaiHoaDon) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = """
                         select new com.mycompany.duanmaujava.ViewModels.ViewModelsClass.HoaDonReponse
                         (hd.id,hd.ma,hd.ngayTao,hd.nhanVien.ho,hd.nhanVien.tenDem,hd.nhanVien.ten,hd.tinhTrang)
                         from HoaDon hd where hd.tinhTrang = :tt
                         """;
            Query query = session.createQuery(hql);
            query.setParameter("tt", trangThaiHoaDon);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        HoaDonRepositoryImpl repo = new HoaDonRepositoryImpl();
        System.out.println(repo.getAll());

    }

    @Override
    public HoaDon getOneByMa(String ma) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = """
                         select hd from HoaDon hd where hd.ma = :ma
                         """;
            Query query = session.createQuery(hql);
            query.setParameter("ma", ma);
            return (HoaDon) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
