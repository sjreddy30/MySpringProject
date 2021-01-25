package com.lti.jpa;

import java.util.List;

public interface MyDeptRepository {
	public void addDepartment(MyDept d);
	public MyDept findDepartment(int dno);
	public List<MyDept> getAllDepartments();
	public void updateDepartment(MyDept d);
	public void deleteDepartment(MyDept d);
}
