package com.ttest.go;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

public class MyOracleConnectionTest {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@meongnyang.c2aqelxnnbez.ap-northeast-2.rds.amazonaws.com:1521/mn";
	private static final String ID = "meongnyang";
	private static final String PASS = "vmfhwprxm";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try
		{
			Connection conn = DriverManager.getConnection(URL, ID, PASS);
			System.out.println(conn);
			PreparedStatement pstmt = conn.prepareStatement("SELECT 30*30 FROM DUAL");
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
