package com.situ.day020.study;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.situ.day017.study.JDBCUtil;

public class Transaction {
	@Test
	public void transactionDemo() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='张三';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='李四';";

		try {
			connection = JDBCUtil.getConnection();
			// 默认是true，遇到executeUpdate自动提交更改数据库，而我们
			// 希望开启事物，直到遇到commit()才去真正的提交到数据库
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			int i = 3 / 0;
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			connection.commit();// 手动提交
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JDBCUtil.close(connection, preparedStatement, null);
		}
	}
	
	
	@Test
	public void callableStatementTest() {
	   Connection connection = null;
	   CallableStatement callableStatement = null;
	   ResultSet resultSet = null;
	   try {
	     connection = JDBCUtil.getConnection();
	     callableStatement = connection.prepareCall("CALL shwo_student");
	     resultSet = callableStatement.executeQuery();
	     while (resultSet.next()) {
	        int id = resultSet.getInt("id");
	        String name = resultSet.getString("name");
	        int age = resultSet.getInt("age");
	        String gender = resultSet.getString("gender");
	        Student student = new Student(id, name, age, gender);
	        System.out.println(student);
	     }
	   } catch (SQLException e) {
	     e.printStackTrace();
	   }

	}
}
