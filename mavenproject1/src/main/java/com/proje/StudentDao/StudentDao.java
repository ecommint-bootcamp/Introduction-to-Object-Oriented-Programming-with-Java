/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proje.StudentDao;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author unreal
 */
public interface StudentDao {
        EntityManager getEntityManager();
        EntityTransaction getEntityTransaction();
}
