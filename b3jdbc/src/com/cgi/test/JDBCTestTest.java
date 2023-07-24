package com.cgi.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.cgi.util.JDBCTest;

class JDBCTestTest {

	@Test
	void testConnecToDb() {
		Connection con = null;
		JDBCTest jb = new JDBCTest();
		try {
			con = jb.connecToDb();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!= null) con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
		assertNotNull(con);

	}

	
	@Test
	void testProcessSqlStmt(){
		JDBCTest jb = new JDBCTest();
		Connection con = null;
		
		con = jb.connecToDb();

		jb.processSqlStmt(con);
	}
}
