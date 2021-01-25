package com.lti.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

public class MyDeptDAOImpl implements MyDeptDAO {

	DataSource datasource;

	public void setDatasource(DataSource ds)
	{
		System.out.println("setDatasource() invoked...");
		datasource=ds;
	}
	
	public void addDepartmentRecord(MyDept d) {
		
	Connection con=null;
	try
	{
		con =  datasource.getConnection();
		System.out.println("Connected to database...");
		
		PreparedStatement ps = con.prepareStatement("insert into mydept(DEPTNO,LOC,DEPTNAME) values(?,?,?)");
		System.out.println("Prepared statement created...");
		ps.setInt(1, d.getDepartmentNumber());
		ps.setString(2,d.getDepartmentLocation());
		ps.setString(3, d.getDepartmentName());
		ps.executeUpdate();
		System.out.println("1 Row Inserted...");
		ps.close();
		con.close();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}	
}

	
}
