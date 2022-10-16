/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.ChiTietSanPham;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.ChiTietSanPhamViewModel;
import com.mycompany.duanmaujava.Repositories.ChiTietSanPhamRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class ChiTietSanPhamRepositoryImpl implements ChiTietSanPhamRepository {

    @Override
    public ChiTietSanPham getOne(ChiTietSanPham t) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            return session.get(ChiTietSanPham.class, t.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChiTietSanPham save(ChiTietSanPham t) {
        Transaction transaction = null;
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return t;
    }

    @Override
    public ChiTietSanPham update(ChiTietSanPham t) {
        Transaction transaction = null;
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return t;
    }

    @Override
    public boolean delete(ChiTietSanPham t) {
        Transaction transaction = null;
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
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
    public List<ChiTietSanPham> getList() {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<ChiTietSanPham> getByTenSP(String ten) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp where ctsp.sanPham.ten like :ten");
            query.setParameter("ten", "%" + ten + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChiTietSanPham getByIdSanPham(String id) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp where ctsp.sanPham.id = :id");
            query.setParameter("id", id);
            return (ChiTietSanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChiTietSanPham getByIdDongSP(String id) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp where ctsp.dongSP.id = :id");
            query.setParameter("id", id);
            return (ChiTietSanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChiTietSanPham getByIdNhaSX(String id) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp where ctsp.nhaSanXuat.id = :id");
            query.setParameter("id", id);
            return (ChiTietSanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ChiTietSanPham getByIdMauSac(String id) {
        try (Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From ChiTietSanPham ctsp where ctsp.mauSac.id = :id");
            query.setParameter("id", id);
            return (ChiTietSanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
