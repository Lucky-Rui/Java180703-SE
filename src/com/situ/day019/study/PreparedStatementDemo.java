package com.situ.day019.study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.situ.day017.study.JDBCUtil;

public class PreparedStatementDemo {
	@Test
	public void stateLogin() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String name = "dhfoh' OR 1=1 -- y";
		String password = "374934";
		try {
			connection = JDBCUtil.getConnection();
			String sql = "SELECT * FROM USER WHERE NAME='" + name + "' and password='" + password + "';";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				System.out.println("登录成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, statement, resultSet);
		}
	}

	@Test
	public void preparedStatementLogin() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		// String name = "dhfoh' OR 1=1 -- y";
		// String password = "374934";
		String name = "lisi";
		String password = "123";
		try {
			connection = JDBCUtil.getConnection();
			String sql = "SELECT * FROM USER WHERE NAME=? and password=?;";
			// 预编译sql
			preparedStatement = connection.prepareStatement(sql);
			// 设置参数的值 参数位置,参数值
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String na = resultSet.getString("name");
				String pa = resultSet.getString("password");
				System.out.println(na);
				System.out.println(pa);
				System.out.println("登录成功");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
