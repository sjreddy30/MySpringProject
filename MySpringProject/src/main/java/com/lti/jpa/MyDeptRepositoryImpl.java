package com.lti.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


public class MyDeptRepositoryImpl implements MyDeptRepository 
{
	@PersistenceContext(unitName = "Spring-JPA") //Spring-JPA
	private EntityManager entityManager;
	
	@Transactional // declarative transaction management
	public void addDepartment(MyDept d) {
		System.out.println("Entity Manager : "+entityManager);
		try {
			entityManager.persist(d);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Transactional
	public MyDept findDepartment(int dno) {
		return entityManager.find(MyDept.class,dno);
	}

	@Transactional
	public List<MyDept> getAllDepartments() {
		return entityManager.createQuery(" from MyDept").getResultList();
	}
	
	@Transactional
	public void updateDepartment(MyDept d) {
		entityManager.merge(d);
	}
	
	@Transactional
	public void deleteDepartment(MyDept d) {
		MyDept dep = entityManager.getReference(MyDept.class, d.getDepartmentNumber());
		entityManager.remove(dep);
	}

}
