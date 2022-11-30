/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proje.repository;

import com.proje.Student.Student;
import com.proje.StudentDao.StudentDao;
import com.proje.StudentDaoImp.StudentDaoImp;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


/**
 *
 * @author unreal
 */
public class StudentRepositoryImplement implements StudentRepository{

    private StudentDao studentdao=new StudentDaoImp();
    private EntityManager entityManager=studentdao.getEntityManager();
    private EntityTransaction transaction=studentdao.getEntityTransaction();
    
    @Override
    public void saveStudent(Student student) {
        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
    }

    @Override
    public Student find(int id) {
        Student student=this.entityManager.find(Student.class,id);
        if(student!=null){
            return student;
        }
        else{
            return null;
        }
    }

    @Override
    public Student updateStudent(Student student) {
       Student updateStudent=this.entityManager.merge(student);
       return updateStudent;
    }

    @Override
    public void deleteStudent(int id) {
       transaction.begin();
       entityManager.remove(id);
       transaction.commit();
    }
    
}
