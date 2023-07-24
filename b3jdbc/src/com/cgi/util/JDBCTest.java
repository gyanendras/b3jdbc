package com.cgi.util;

import java.sql.Connection;
import java.sql.DriverManager;

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
	 
	 void processSql(){
		 
		 
	 }

}
