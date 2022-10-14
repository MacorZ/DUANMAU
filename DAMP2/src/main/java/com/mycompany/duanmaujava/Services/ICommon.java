/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.duanmaujava.Services;

import java.util.List;

/**
 *
 * @author acer
 */
public interface ICommon<T> {
    List<T> getAll();

    String save(T t);

    T getOne(T t);
}
