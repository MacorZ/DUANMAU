/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.duanmaujava.Repositories.impl;

import com.mycompany.duanmaujava.DomainModels.NhanVien;
import com.mycompany.duanmaujava.Repositories.NhanVienRepository;
import com.mycompany.duanmaujava.Utilities.hibernateUtil;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author acer
 */
public class NhanVienRepositoryImpl implements NhanVienRepository {

    @Override
    public List<NhanVien> getAll() {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "From NhanVien";
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NhanVien getOne(NhanVien t) {
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            String hql = "select nv from NhanVien nv where nv.ma = :ma";
            Query query = session.createQuery(hql);
            query.setParameter("ma", t.getMa());
            return (NhanVien) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NhanVien save(NhanVien t) {
        Transaction transaction = null;
        try ( Session session = hibernateUtil.getFACTORY().openSession();) {
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return t;
    }

    @Override
    public NhanVien update(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NhanVien t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
