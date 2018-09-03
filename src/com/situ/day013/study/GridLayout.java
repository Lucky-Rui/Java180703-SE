package com.situ.day013.study;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class GridLayout {
	// 网格布局管理器GridLayout
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		// 设置布局
		panel.setLayout(new java.awt.GridLayout(3, 3));

		// 创建组件
		JButton[] buttons = new JButton[9];// [null,null,null]
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton((i + 1) + "");
		}
		// 添加组件
		for (int i = 0; i < buttons.length; i++) {
			panel.add(buttons[i]);
		}

		// 设置JFrame属性
		// 禁止用户改变窗口大小 resize able 能够
		frame.setResizable(false);
		frame.setSize(500, 500);
		frame.setLocation(500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
