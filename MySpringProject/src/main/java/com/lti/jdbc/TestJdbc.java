package com.lti.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	public static void main(String[] args) {
		System.out.println("Loading the container....");
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("spring-jdbc.xml");
		System.out.println("Loaded the container...."+container);
		
		MyDept d = (MyDept)container.getBean("myDept");
		d.setDepartmentNumber(60);
		d.setDepartmentLocation("J&K");
		d.setDepartmentName("R&D");
		
		MyDeptDAOImpl     dao = (MyDeptDAOImpl)container.getBean("myDeptDAO");
		dao.addDepartmentRecord(d);
	}	
}
