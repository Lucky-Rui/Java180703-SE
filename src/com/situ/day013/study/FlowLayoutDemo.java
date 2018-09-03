package com.situ.day013.study;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class FlowLayoutDemo {
	// 流式布局管理器FlowLayout
	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayoutDemo");
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		// 创建组件
		JButton button1 = new JButton("张三 ");
		JButton button2 = new JButton("李四 ");
		JButton button3 = new JButton("王五 ");
		JButton button4 = new JButton("赵六 ");
		JButton button5 = new JButton("苏童 ");
		JButton button6 = new JButton("王瑞 ");
		// 添加组件
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);

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
