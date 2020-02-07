package com.ttest.go;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MyOracleConnectionTest {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static final String ID = "stage41";
	private static final String PASS = "qwe";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try (Connection conn = DriverManager.getConnection(URL, ID, PASS)) {
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
