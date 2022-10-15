/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.CuaHang;
import com.mycompany.duanmaujava.Repositories.CuaHangRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import com.mycompany.duanmaujava.ViewModels.ViewModelsClass.CuaHangViewModel;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class CuaHangRepositorIpml implements CuaHangRepository {

    @Override
    public List<CuaHang> getList() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = """
                              From CuaHang
                              """;
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public CuaHang getOneById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean checkSave(String ma) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery(" From CuaHang ch where ch.ma = :ma");
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
            Query query = session.createQuery(" From CuaHang ch where ch.ma = :ma and ch.id != id");
            query.setParameter("ma", ma);
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean checkDelete(String id) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            Query query = session.createQuery(" From NhanVien nv where nv.cuaHang.id != :id");
            query.setParameter("id", id);
            return query.getResultList().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean save(CuaHang ch) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(CuaHang ch) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.update(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(CuaHang ch) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.delete(ch);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
        return true;
    }

}
