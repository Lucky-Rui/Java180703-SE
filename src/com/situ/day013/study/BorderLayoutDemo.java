package com.situ.day013.study;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BorderLayoutDemo {
	// 边界布局管理器BorderLayout
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new BorderLayout());
		// 创建组件
		JButton northbutton = new JButton("北部");
		JButton southbutton = new JButton("南部");
		JButton westbutton = new JButton("西部");
		JButton eastbutton = new JButton("东部");
		JButton centerbutton = new JButton("中部");
		// 添加组件
		panel.add(northbutton, BorderLayout.NORTH);
		panel.add(southbutton, BorderLayout.SOUTH);
		panel.add(westbutton, BorderLayout.EAST);
		panel.add(eastbutton, BorderLayout.WEST);
		panel.add(centerbutton, BorderLayout.CENTER);

		// 禁止用户改变窗体大小 resize able
		frame.setResizable(false);
		// 关闭frame,默认并不是真正关闭程序
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置大小
		frame.setSize(500, 400);
		// 设置初始位置
		frame.setLocation(200, 200);
		// 默认是不显示
		frame.setVisible(true);

	}
}
