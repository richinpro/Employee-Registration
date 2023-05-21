package com.rich.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rich.registration.model.Employee;

public class EmployeeDao {
	public static int register(Employee emp) throws ClassNotFoundException {
		String query = "INSERT INTO emp" + " (id, name, username,"
				+ "password, phone, email) VALUES "+"(?,?,?,?,?,?);";
		
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/employee?useSSL=false"
			, "root", "rIchU@13");
				
			PreparedStatement ps = con.prepareStatement(query)){
			
			ps.setInt(1, 2);
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getUsername());
			ps.setString(4, emp.getPassword());
			ps.setString(5, emp.getPhone());
			ps.setString(6, emp.getEmail());
			
			System.out.println(ps);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
				
				
	}
}
