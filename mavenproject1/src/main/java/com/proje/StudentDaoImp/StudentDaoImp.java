/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proje.StudentDaoImp;


import com.proje.StudentDao.StudentDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author unreal
 */
public class StudentDaoImp implements StudentDao{
    private EntityManager entityManager = null;
    
    @Override
    public EntityManager getEntityManager() {
       EntityManagerFactory factory  = Persistence.createEntityManagerFactory("persistence-unit");
       this.entityManager=factory.createEntityManager();
       return entityManager;
    }

    @Override
    public EntityTransaction getEntityTransaction() {
      EntityTransaction transaction=this.entityManager.getTransaction();
      return transaction;
    }

    
    
}
