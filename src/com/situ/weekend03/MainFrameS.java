package com.situ.weekend03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MainFrameS extends JFrame {
	private StudentTableModel studentTableModel;
	private JTable table;
	List<Student> list = new ArrayList<>();
	List<Student> selectlist = new ArrayList<>();
	StudentIO studentIO = new StudentIO();

	public static void main(String[] args) {
		MainFrameS mainFrameS = new MainFrameS();
		mainFrameS.init();
	}

	public void init() {
		this.setSize(800, 600);
		// mainFrame.setLocation(300, 50);
		SwingUtil.setLocationCenter(this);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel mainPanel = (JPanel) this.getContentPane();
		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(boxLayout);
		// 窗口从上往下第一部分
		JPanel topPanel = new JPanel();
		// 设置布局之间的间隙
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

		// 刷新
		// JButton refreshButton = new JButton("刷新");
		// refreshButton.setPreferredSize(new Dimension(80, 30));
		// refreshButton.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// selectlist.clear();
		// for (int i = 0; i < list.size(); i++) {
		// boolean result = true;
		// if (result) {
		// selectlist.add(list.get(i));
		// }
		// }
		// studentTableModel.setData(selectlist);
		// table.updateUI();
		// }
		// });
		// topPanel.add(refreshButton);

		// 姓名
		JLabel nameLabel = new JLabel("学生姓名： ");
		JTextField nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(130, 30));
		topPanel.add(nameLabel);
		topPanel.add(nameText);
		// 搜索按钮
		JButton searchButton = new JButton("搜索");
		searchButton.setPreferredSize(new Dimension(80, 30));
		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				// 清除原表格
				selectlist.clear();
				for (int i = 0; i < list.size(); i++) {
					boolean result = true;
					// 如果输入框中没有输入数据则不与该项比较
					if (!name.equals("")) {
						result = result && (name.equals(list.get(i).getName()));
					}
					if (result) {
						selectlist.add(list.get(i));
					}
				}
				studentTableModel.setData(selectlist);
				table.updateUI();
			}
		});
		topPanel.add(searchButton);

		// 窗口从上往下第二部分，主要是table表格
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);

		table = new JTable();
		table.setRowHeight(45);

		list = studentIO.loadDate();
		selectlist.addAll(list);

		studentTableModel = new StudentTableModel(list);
		table.setModel(studentTableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(300, 50));
		centerPanel.setLayout(new BorderLayout());
		centerPanel.add(scrollPane, BorderLayout.CENTER);

		// 窗口从上往下第三部分, 新增、修改、删除三个按钮
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 10));

		// addButton
		JButton addButton = new JButton("新增");
		addButton.setPreferredSize(new Dimension(80, 30));
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddStudentFrame addStudentFrame = new AddStudentFrame(list, MainFrameS.this);
				addStudentFrame.init();
				MainFrameS.this.reloadTable();
				table.updateUI();
			}
		});
		bottomPanel.add(addButton);
		// updateButton
		JButton updateButton = new JButton("修改");
		updateButton.setPreferredSize(new Dimension(80, 30));
		updateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int indices = table.getSelectedRow();
				if (indices > -1) {
					Student selectStudent = selectlist.get(indices);
					UpdateStudentFrame updateStudentFrame = new UpdateStudentFrame(list, selectStudent,
							MainFrameS.this);
					updateStudentFrame.init();
					MainFrameS.this.reloadTable();
					table.updateUI();
				} else {
					JOptionPane.showMessageDialog(MainFrameS.this, "请选择您要修改的行", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
			}
		});
		bottomPanel.add(updateButton);
		// deleteButton
		JButton deleteButton = new JButton("删除");
		deleteButton.setPreferredSize(new Dimension(80, 30));
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 选中的所有行的索引
				int[] indices = table.getSelectedRows();
				if (indices.length == 0) {// 未选中任何行
					JOptionPane.showMessageDialog(MainFrameS.this, "请选择您要删除的行", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				for (int i = 0; i < indices.length; i++) {
					Integer id = (Integer) table.getValueAt(indices[i], 0);
					Iterator<Student> iterator = list.iterator();
					while (iterator.hasNext()) {
						Student student = iterator.next();
						if (student.getId() == id) {
							iterator.remove();
						}
					}
				}
				studentIO.save(list);
				MainFrameS.this.reloadTable();
			}
		});
		bottomPanel.add(deleteButton);

		mainPanel.add(topPanel);
		mainPanel.add(centerPanel);
		mainPanel.add(bottomPanel);

		this.setVisible(true);
	}

	// private List<Student> loadData() {
	// list = new ArrayList<>();
	// Student student1 = new Student(1, "张三1", 20, "男");
	// Student student2 = new Student(2, "张三2", 20, "男");
	// Student student3 = new Student(3, "张三3", 20, "男");
	// Student student4 = new Student(4, "张三4", 20, "男");
	// Student student5 = new Student(5, "张三5", 20, "男");
	// Student student6 = new Student(6, "张三6", 20, "男");
	// Student student7 = new Student(7, "张三7", 20, "男");
	// Student student8 = new Student(8, "张三8", 20, "男");
	// Student student9 = new Student(9, "张三9", 20, "男");
	// list.add(student1);
	// list.add(student2);
	// list.add(student3);
	// list.add(student4);
	// list.add(student5);
	// list.add(student6);
	// list.add(student7);
	// list.add(student8);
	// list.add(student9);
	// return list;
	// }

	// public List<Student> getData() {
	// return list;
	// }

	/*
	 * 重新加载表格数据
	 */
	public void reloadTable() {
		studentTableModel.setData(list);
		studentTableModel.fireTableDataChanged();// 触发表格数据变更事件
	}
}
