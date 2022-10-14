/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.NhaSanXuat;
import com.mycompany.duanmaujava.Repositories.NhaSanXuatRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class NhaSanXuatRepositoryImpl implements NhaSanXuatRepository {

    @Override
    public List<NhaSanXuat> getList() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From NhaSanXuat nsx");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NhaSanXuat save(NhaSanXuat nhaSanXuat) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(nhaSanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return nhaSanXuat;
    }

    @Override
    public NhaSanXuat update(NhaSanXuat nhaSanXuat) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(nhaSanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return nhaSanXuat;
    }

    @Override
    public boolean delete(NhaSanXuat nhaSanXuat) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.delete(nhaSanXuat);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
        return true;
    }

    @Override
    public NhaSanXuat getOneById(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            return session.get(NhaSanXuat.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean checkUpdate(String ma, String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From NhaSanXuat nsx where nsx.ma = :ma and nsx.id != :id");
            query.setParameter("ma", ma);
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<NhaSanXuat> getListByTen(String ten) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From NhaSanXuat nsx where nsx.ten like :ten");
            query.setParameter("ten", "%" + ten + "%");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean checkSave(String ma) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From NhaSanXuat nsx where nsx.ma = :ma");
            query.setParameter("ma", ma);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
