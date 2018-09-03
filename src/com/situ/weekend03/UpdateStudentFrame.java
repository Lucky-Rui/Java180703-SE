package com.situ.weekend03;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateStudentFrame extends JFrame {
	List<Student> list;
	Student selectStudent;
	private MainFrameS mainFrameS;

	public UpdateStudentFrame(List<Student> list, Student selectStudent, MainFrameS mainFrameS) {
		this.list = list;
		this.selectStudent = selectStudent;
		this.mainFrameS = mainFrameS;
	}

	public void init() {
		this.setSize(300, 350);
		this.setLocation(300, 50);
		SwingUtil.setLocationCenter(this);
		// 只是销毁这个
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel mainPanel = (JPanel) this.getContentPane();
		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(boxLayout);
		// 姓名
		JPanel namePanel = new JPanel();
		JLabel nameLable = new JLabel("姓名： ");
		namePanel.add(nameLable);
		JTextField nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(120, 30));
		nameText.setText(selectStudent.getName());
		namePanel.add(nameText);
		// 年龄
		JPanel agePanel = new JPanel();
		JLabel ageLable = new JLabel("年龄： ");
		agePanel.add(ageLable);
		JTextField ageText = new JTextField();
		ageText.setPreferredSize(new Dimension(120, 30));
		ageText.setText(String.valueOf(selectStudent.getAge()));
		agePanel.add(ageText);
		// 性别
		JPanel genderPanel = new JPanel();
		JLabel genderLable = new JLabel("性别： ");
		genderPanel.add(genderLable);
		JTextField genderText = new JTextField();
		genderText.setPreferredSize(new Dimension(120, 30));
		genderText.setText(selectStudent.getGender());
		genderPanel.add(genderText);
		// 添加按钮
		JPanel savePanel = new JPanel();
		JButton saveButton = new JButton("保存");
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String gender = genderText.getText();
				int age = Integer.parseInt(ageText.getText());

				selectStudent.setName(name);
				selectStudent.setGender(gender);
				selectStudent.setAge(age);

				StudentIO studentIO = new StudentIO();
				studentIO.save(list);
				mainFrameS.list = studentIO.loadDate();
				mainFrameS.selectlist.addAll(list);
				mainFrameS.reloadTable();

				// 保存成功或者失败，弹出提示框
				JOptionPane.showMessageDialog(null, "修改成功");

				UpdateStudentFrame.this.dispose();
			}
		});
		savePanel.add(saveButton);

		mainPanel.add(namePanel);
		mainPanel.add(agePanel);
		mainPanel.add(genderPanel);
		mainPanel.add(savePanel);

		this.setVisible(true);
	}
}
