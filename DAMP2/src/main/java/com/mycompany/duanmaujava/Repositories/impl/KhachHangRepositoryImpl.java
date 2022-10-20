/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.KhachHang;
import com.mycompany.duanmaujava.Repositories.KhachHangRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class KhachHangRepositoryImpl implements KhachHangRepository {

    @Override
    public List<KhachHang> getList() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "from KhachHang";
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean save(KhachHang khachHang) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean checkSave(String ma) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "from KhachHang kh where kh.ma = :ma ";
            Query query = session.createQuery(hql);
            query.setParameter("ma", ma);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(KhachHang khachHang) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean checkUpdate(String ma, String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "from KhachHang kh where kh.ma = :ma and kh.id != :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            query.setParameter("ma", ma);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(KhachHang khachHang) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.delete(khachHang);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    @Override
    public boolean checkDelete(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "from  HoaDon hd where hd.khachHang.id != :id ";
            Query query = session.createQuery(hql);
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
