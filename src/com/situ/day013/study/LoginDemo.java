package com.situ.day013.study;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class LoginDemo {
	// 使用GridLayout，三行一列，每一行是一个JPanel
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.setLayout(new GridLayout(3, 1));

		// namePanel
		JPanel namePanel = new JPanel();
		JLabel nameLabel = new JLabel("姓名：");
		JTextField nameTextField = new JTextField(10);
		namePanel.add(nameLabel);
		namePanel.add(nameTextField);
		panel.add(namePanel);

		// passwordPanel
		JPanel passwordPanel = new JPanel();
		JLabel passwordLabel = new JLabel("密码：");
		JTextField passwordTextField = new JTextField(10);
		passwordPanel.add(passwordLabel);
		passwordPanel.add(passwordTextField);
		panel.add(passwordPanel);

		// loginPanel
		JPanel loginPanel = new JPanel();
		JButton loginButton = new JButton("登录");
		JButton cancelButton = new JButton("取消");
		loginPanel.add(loginButton);
		loginPanel.add(cancelButton);
		panel.add(loginPanel);

		// 禁止用户改变窗体大小 resize able
		frame.setResizable(false);
		// 关闭frame,默认并不是真正关闭程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置大小
		frame.setSize(300, 150);
		// 设置初始位置
		frame.setLocation(500, 200);
		// 默认是不显示
		frame.setVisible(true);
	}
}
