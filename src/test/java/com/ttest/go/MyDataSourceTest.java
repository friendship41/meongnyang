package com.ttest.go;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml", "\"file:src/main/webapp/WEB-INF/spring/*.xml" })
public class MyDataSourceTest {
	@Inject
	private DataSource ds;

	@Test
	public void testConnection() throws Exception {
		try (Connection conn = ds.getConnection()) {
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
