package com.lti.jpa;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-jpa.xml")
public class TestSpringORM {
	@Autowired
	MyDeptRepository myDeptRepository ;
	
	@Test
	public void testDept() {
			MyDept myDept = new MyDept(); 
			myDept.setDepartmentNumber(50);
			myDept.setDepartmentLocation("FunZone");
			myDept.setDepartmentName("Fun");
			myDeptRepository.addDepartment(myDept);
	}

	@Test
	public void testDept2() {
			MyDept myDept = new MyDept(); 
			myDept = myDeptRepository.findDepartment(50);
			System.out.println("Dept no : "+myDept.getDepartmentNumber());
			System.out.println("Dept name : "+myDept.getDepartmentName());
			System.out.println("Dept location : "+myDept.getDepartmentLocation());
	}
	
	@Test
	public void testDept3() {
			List<MyDept> myDept = new ArrayList<MyDept>(); 
			myDept = myDeptRepository.getAllDepartments();
			for(MyDept dep : myDept)
			{	
			System.out.println("Dept no : "+dep.getDepartmentNumber());
			System.out.println("Dept name : "+dep.getDepartmentName());
			System.out.println("Dept location : "+dep.getDepartmentLocation());	
			}
	}
	
	@Test
	public void testDept4() {
			MyDept myDept = new MyDept(); 
			myDept.setDepartmentNumber(50);
			myDept.setDepartmentName("Funnier");
			myDept.setDepartmentLocation("FunZone2");
			myDeptRepository.updateDepartment(myDept);
	}
	
	@Test
	public void testDept5() {
			MyDept myDept = new MyDept(); 
			myDept.setDepartmentNumber(50);
			myDeptRepository.deleteDepartment(myDept);
	}
}
