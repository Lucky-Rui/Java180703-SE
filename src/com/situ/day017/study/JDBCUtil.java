package com.situ.day017.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * JDBC工具类
 */
public class JDBCUtil {
	// private static final String DRIVER = "com.mysql.jdbc.Driver";
	// private static final String URL =
	// "jdbc:mysql://localhost:3306/java180703";
	// private static final String USER = "root";
	// private static final String PASSWORD = "root";

	private static String driver;
	private static String url;
	private static String user;
	private static String password;

	static {
		InputStream inputStream;
		try {
			inputStream = new FileInputStream("src/com/situ/day017/study/db.properties");
			Properties properties = new Properties();
			properties.load(inputStream);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			user = properties.getProperty("user");
			password = properties.getProperty("password");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			// 1、记载驱动 Class.forName("");
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 2、获得连接对象Connection
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

	// 6、关闭连接
	public static void close(Connection connection, Statement statement, ResultSet resultSet) {
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
