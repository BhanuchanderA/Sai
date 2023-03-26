package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class Studentdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ram");
	public Student saveStudent(Student s) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(s);
		et.commit();
		return em.find(Student.class, s.getId());	
	}
	
	public Student getStudent(int id) {
		EntityManager em=emf.createEntityManager();
		return em.find(Student.class, id);
		
	}
	public List<Student> getAllStudent(){
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from Student a");
		
		return q.getResultList(); 
		
	}
	public Student deleteStudent(int id) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s=em.find(Student.class, id);
		if(s!=null) {
		et.begin();
		em.remove(s);
		et.commit();
		}
		return s;	
	}
	
	public Student updateStudent(Student s) {
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s1=em.find(Student.class, s.getId());
		if(s1!=null) {
		et.begin();
		em.merge(s);
		et.commit();
		}
		return s;
	
		
	}

}
