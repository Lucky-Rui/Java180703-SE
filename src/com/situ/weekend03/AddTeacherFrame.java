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

public class AddTeacherFrame extends JFrame {
	private MainFrameT mainFrameT;
	List<Teacher> list;

	public AddTeacherFrame(List<Teacher> list, MainFrameT mainFrameT) {
		this.list = list;
		this.mainFrameT = mainFrameT;
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
		namePanel.add(nameText);
		// 年龄
		JPanel agePanel = new JPanel();
		JLabel ageLable = new JLabel("年龄： ");
		agePanel.add(ageLable);
		JTextField ageText = new JTextField();
		ageText.setPreferredSize(new Dimension(120, 30));
		agePanel.add(ageText);
		// 性别
		JPanel genderPanel = new JPanel();
		JLabel genderLable = new JLabel("性别： ");
		genderPanel.add(genderLable);
		JTextField genderText = new JTextField();
		genderText.setPreferredSize(new Dimension(120, 30));
		genderPanel.add(genderText);
		// 添加按钮
		JPanel savePanel = new JPanel();
		JButton saveButton = new JButton("保存");
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("AddTeacherFrame.init()");
				String name = nameText.getText().trim();
				System.out.println(name);
				int age = Integer.parseInt(ageText.getText().trim());
				System.out.println(age);
				String gender = genderText.getText().trim();
				System.out.println(gender);

				Teacher teacher = new Teacher(list.size() + 1, name, age, gender);
				list.add(teacher);
				TeacherIO teacherIO = new TeacherIO();
				teacherIO.save(list);
				mainFrameT.reloadTable();
				mainFrameT.selectlist = teacherIO.loadDate();

				// 保存成功或者失败，弹出提示框
				JOptionPane.showMessageDialog(null, "保存成功");

				AddTeacherFrame.this.dispose();
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
