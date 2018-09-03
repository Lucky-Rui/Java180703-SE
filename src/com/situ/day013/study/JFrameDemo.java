package com.situ.day013.study;

import javax.swing.JFrame;

class JFrameDemo {
	public static void main(String[] args) {
		// JFrame是一个顶级容器（可以添加其他的swing组件类）
		JFrame frame = new JFrame();
		// 给窗体设置标题
		frame.setTitle("Hello Swing!");
		// 设置大小
		// the new width of this component in pixels
		frame.setSize(500, 400);
		// 设置初始位置
		frame.setLocation(500, 200);
		// 关闭frame(当点击窗口的关闭按钮的时候退出程序)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 默认是不显示
		frame.setVisible(true);
	}
}
