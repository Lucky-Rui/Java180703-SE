package com.situ.day017.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCTest {
	@Test
	public void testDemo1() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			// 1、加载驱动：Class.forName("");
			Class.forName("com.mysql.jdbc.Driver");
			// 2、获得链接对象Connection
			connection = DriverManager.getConnection("jdbc:mysql:" + "//localhost:3306/java180703", "root", "root");
			// 3、写sql语句
			String sql = "SELECT * FROM student;";
			// 4、创建Statement
			statement = connection.createStatement();
			// 5、执行sql语句
			// 更新：delete/update/insert executeUpdate() 返回值int：表示影响的行数.
			// 查询：select executeQuery() 返回结果集：ResultSet
			resultSet = statement.executeQuery(sql);
			// System.out.println(resultSet);
			List<Student> list = new ArrayList<Student>();
			while (resultSet.next()) {
				// Integer id = resultSet.getInt(1);
				// String name = resultSet.getString(2);
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				Student student = new Student(id, name, age, gender);
				list.add(student);
			}
			for (Student student : list) {
				System.out.println(student);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			// 6、关闭连接
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void testDemo2() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JDBCUtil.getConnection();
			String sql = "select id,name,age,gender from student;";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			List<Student> list = new ArrayList<>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				Student student = new Student(id, name, age, gender);
				list.add(student);
			}
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, statement, resultSet);
		}
	}

	@Test
	public void testUpdate() {
		Connection connection = null;
		Statement statement = null;
		try {
			// 2、获得连接对象Connection
			connection = JDBCUtil.getConnection();
			// 3、写sql语句
			String sql = "update student set age=age+8 where id=1;";
			// String sql = "insert into student(name,age,gender)
			// values('yyyy',30,'男');";
			// String sql = "delete from student where id=10;";
			// 4、创建Statement
			statement = connection.createStatement();
			// 5、执行sql语句
			// 更新类(更新了表里面数据)：delete/update/insert executeUpdate()
			// 返回值int:表示你影响的行数

			// 查询(没有改变表里面数据)：select executeQuery() 返回结果集：ResultSet
			int count = statement.executeUpdate(sql);
			System.out.println("count: " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6、关闭连接
			JDBCUtil.close(connection, statement, null);
		}

	}

}
