package com.cgi.util;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

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

}
