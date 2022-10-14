/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.SanPham;
import com.mycompany.duanmaujava.Repositories.SanPhamRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class SanPhamRepositoryImpl implements SanPhamRepository {

    @Override
    public List<SanPham> getAll() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From SanPham sp ");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SanPham getOne(SanPham t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From SanPham sp where sp.ma = :ma");
            query.setParameter("ma", t.getMa());
            return (SanPham) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SanPham save(SanPham t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return t;
    }

    @Override
    public SanPham update(SanPham t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return t;
    }

    @Override
    public boolean delete(SanPham t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Transaction transaction = session.beginTransaction();
            session.delete(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<SanPham> getListByTen(String ten) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From SanPham sp where sp.ten like  :ten");
            query.setParameter("ten", "%" + ten + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean checkUpdate(String ma, String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From SanPham sp where sp.ma = :ma and sp.id != :id ");
            query.setParameter("ma", ma);
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
     @Override
    public boolean checkSave(String ma) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From SanPham sp where sp.ma = :ma");
            query.setParameter("ma", ma);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
