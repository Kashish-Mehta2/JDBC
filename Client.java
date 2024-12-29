package com.jdbc.learning;

import java.sql.SQLException;

import com.jdbc.learning.dao.EmployeeDao;
import com.jdbc.learning.dao.EmployeeDaoImpl;
import com.jdbc.learning.entity.Employee;

public class Client {

	public static void main(String[] args) throws SQLException {
		
		
		
		
		Employee vikas = new Employee(2,"Vikas","Male",345678);
		Employee unnati = new Employee(3,"unnati","female",345678);
		Employee pragati = new Employee(4,"Pragati","female",345678);
		
//		DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend", "root", "root").createStatement().executeUpdate("insert into mytable (name,gender) values('Vikas','male')");
		
		
		EmployeeDao edao = new EmployeeDaoImpl();
		edao.saveEmployee(vikas);
		edao.saveEmployee(unnati);
		edao.saveEmployee(pragati);
		System.out.println("Transaction successful...................");

	}

}
