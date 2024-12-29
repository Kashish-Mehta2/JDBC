package com.jdbc.learning.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.learning.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend", "root", "root");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void saveEmployee(Employee e) {

		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into employee(id,name,gender,salary) values(" + e.getId() + ",'"
					+ e.getName() + "','" + e.getGender() + "'," + e.getSalary() + ")");
		System.out.println("Done............");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listAllEmp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getEmpById(int id) {
		// TODO Auto-generated method stub

	}

}
