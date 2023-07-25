package com.cgi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
	 public Connection connecToDb() {
		 Connection conn = null;
		 try {
	            // The newInstance() call is a work around for some
	            // broken Java implementations

	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/hr?" +
	            	                                   "user=root&password=full2work");
	          
	        } catch (Exception ex) {
	           ex.printStackTrace();
	        }
		 
		  return conn;
		 
	 }
	 
	 public void processSqlStmt(Connection conn){
		 try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Employees"); //also create and insert.
			int empId = 0;
			String firstName=null;
			Double sal = null;
			
			while(rs.next()) {
				empId = rs.getInt(1);
				firstName = rs.getString(2);
				sal = rs.getDouble("salary");
				System.out.println(empId+" "+firstName+" "+sal);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		 
	 }

}
