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

public class MainFrameT extends JFrame {
	private TeacherTableModel teacherTableModel;
	private JTable table;
	List<Teacher> list = new ArrayList<>();
	List<Teacher> selectlist = new ArrayList<>();
	TeacherIO teacherIO = new TeacherIO();

	public static void main(String[] args) {
		MainFrameT mainFrameT = new MainFrameT();
		mainFrameT.init();
	}

	public void init() {
		this.setSize(800, 600);
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
		// teacherTableModel.setData(selectlist);
		// table.updateUI();
		// }
		// });
		// topPanel.add(refreshButton);

		// 姓名
		JLabel nameLabel = new JLabel("老师姓名： ");
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
				teacherTableModel.setData(selectlist);
				table.updateUI();
			}
		});
		topPanel.add(searchButton);

		// 窗口从上往下第二部分，主要是table表格
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.BLACK);

		table = new JTable();
		table.setRowHeight(45);

		list = teacherIO.loadDate();
		selectlist.addAll(list);

		teacherTableModel = new TeacherTableModel(list);
		table.setModel(teacherTableModel);
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
				AddTeacherFrame addTeacerFrame = new AddTeacherFrame(list, MainFrameT.this);
				addTeacerFrame.init();
				MainFrameT.this.reloadTable();
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
					Teacher selectTeacher = selectlist.get(indices);
					UpdateTeacherFrame updateTeacherFrame = new UpdateTeacherFrame(list, selectTeacher,
							MainFrameT.this);
					updateTeacherFrame.init();
					MainFrameT.this.reloadTable();
					table.updateUI();
				} else {
					JOptionPane.showMessageDialog(MainFrameT.this, "请选择您要修改的行", "提示", JOptionPane.INFORMATION_MESSAGE);
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
					JOptionPane.showMessageDialog(MainFrameT.this, "请选择您要删除的行", "提示", JOptionPane.INFORMATION_MESSAGE);
					return;
				}
				for (int i = 0; i < indices.length; i++) {
					Integer id = (Integer) table.getValueAt(indices[i], 0);
					Iterator<Teacher> iterator = list.iterator();
					while (iterator.hasNext()) {
						Teacher student = iterator.next();
						if (student.getId() == id) {
							iterator.remove();
						}
					}
				}
				teacherIO.save(list);
				MainFrameT.this.reloadTable();
			}
		});
		bottomPanel.add(deleteButton);

		mainPanel.add(topPanel);
		mainPanel.add(centerPanel);
		mainPanel.add(bottomPanel);

		this.setVisible(true);
	}

	/*
	 * 重新加载表格数据
	 */
	public void reloadTable() {
		teacherTableModel.setData(list);
		teacherTableModel.fireTableDataChanged();// 触发表格数据变更事件
	}
}
