package com.situ.weekend03;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 老师、学生信息管理系统，IO流
 * 
 * @author WANGRUI
 *
 */
public class JFrameDemo extends JFrame {
	public static void main(String[] args) {
		JFrameDemo jFrameDemo = new JFrameDemo();
		jFrameDemo.init();
	}

	public void init() {
		this.setSize(300, 150);
		this.setLocation(300, 50);
		SwingUtil.setLocationCenter(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPanel = (JPanel) this.getContentPane();
		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(boxLayout);

		// namePanel
		JPanel namePanel = new JPanel();
		JLabel nameLabel = new JLabel("信息管理系统");
		namePanel.add(nameLabel);
		mainPanel.add(namePanel);

		// Panel
		JPanel Panel = new JPanel();
		JButton studentButton = new JButton("学生入口");
		studentButton.setPreferredSize(new Dimension(120, 30));
		studentButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrameS mainFrameS = new MainFrameS();
				mainFrameS.init();
			}
		});
		JButton teacherButton = new JButton("教师入口");
		teacherButton.setPreferredSize(new Dimension(120, 30));
		teacherButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrameT mainFrameT = new MainFrameT();
				mainFrameT.init();
			}
		});
		Panel.add(studentButton);
		Panel.add(teacherButton);
		mainPanel.add(Panel);

		this.setVisible(true);
	}

}
