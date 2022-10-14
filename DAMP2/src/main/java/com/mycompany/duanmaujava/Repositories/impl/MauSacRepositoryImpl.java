/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.MauSac;
import com.mycompany.duanmaujava.Repositories.MauSacRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class MauSacRepositoryImpl implements MauSacRepository {

    @Override
    public List<MauSac> getList() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From MauSac ms");
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MauSac save(MauSac mauSac) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(mauSac);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return mauSac;
    }

    @Override
    public MauSac update(MauSac mauSac) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(mauSac);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return null;
        }
        return mauSac;
    }

    @Override
    public boolean delete(MauSac nhaSanXuat) {
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
    public MauSac getOneById(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            return session.get(MauSac.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MauSac> getListByTen(String ten) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From MauSac ms where ms.ten like :ten");
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
            Query query = session.createQuery("From MauSac ms where ms.ma = :ma");
            query.setParameter("ma", ma);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean checkUpdate(String ma, String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery("From MauSac ms where ms.ma = :ma and ms.id != :id");
            query.setParameter("ma", ma);
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
