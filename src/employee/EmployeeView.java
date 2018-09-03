package employee;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

public class EmployeeView {

	// MainFrame

	List<Employee> list = new ArrayList<>();
	List<Employee> selectList = new ArrayList<Employee>();
	EmployeeDao empDao = new EmployeeDao();
	JTable table;
	EmployeeTableModel model;

	public void init() {
		JFrame frame = new JFrame();
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel mainPanel = (JPanel) frame.getContentPane();
		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(boxLayout);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 10));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);

		// 第一层

		JLabel nameLabel = new JLabel();
		nameLabel.setText("姓名");
		panel1.add(nameLabel);
		JTextField nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(100, 30));
		panel1.add(nameText);

		JLabel sexLabel = new JLabel();
		sexLabel.setText("性别");
		panel1.add(sexLabel);
		JTextField sexText = new JTextField();
		sexText.setPreferredSize(new Dimension(100, 30));
		panel1.add(sexText);

		JLabel ageLabel = new JLabel();
		ageLabel.setText("年龄");
		panel1.add(ageLabel);
		JTextField ageText = new JTextField();
		ageText.setPreferredSize(new Dimension(100, 30));
		panel1.add(ageText);

		JButton searchBtn = new JButton();
		searchBtn.setText("查找");
		searchBtn.setPreferredSize(new Dimension(60, 30));
		panel1.add(searchBtn);

		searchBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String sex = sexText.getText();
				int age = -1;
				try {
					age = Integer.parseInt(ageText.getText());
				} catch (Exception ex) {

				}
				selectList.clear();

				for (int i = 0; i < list.size(); i++) {
					boolean result = true;
					// 如果输入框中没有输入数据则不与该项比较
					if (age != -1) {
						result = result && (age == list.get(i).getAge());
					}
					if (!name.equals("")) {
						result = result && (name.equals(list.get(i).getName()));
					}
					if (!sex.equals("")) {
						result = result && (sex.equals(list.get(i).getSex()));
					}
					if (result) {
						selectList.add(list.get(i));
					}
				}
				model.setList(selectList);
				table.updateUI();

			}
		});
		// 第二层
		// 查出所有的员工来
		list = empDao.load();
		selectList.addAll(list);
		model = new EmployeeTableModel(list);
		table = new JTable();
		table.setModel(model);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setPreferredSize(new Dimension(500, 300));
		panel2.add(scroll);

		// 第三层

		JButton addBtn = new JButton();
		addBtn.setText("新增");
		addBtn.setPreferredSize(new Dimension(80, 30));
		panel3.add(addBtn);
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AddEmployeeView aev = AddEmployeeView.getinstance(list, new CallBack() {

					@Override
					public void call() {
						table.updateUI();
					}
				});
				aev.openFrame();
			}
		});

		JButton modifyBtn = new JButton();
		modifyBtn.setText("修改");
		modifyBtn.setPreferredSize(new Dimension(80, 30));
		panel3.add(modifyBtn);
		modifyBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int index = table.getSelectedRow();
				if (index > -1) {
					Employee selectEmp = selectList.get(index);
					new ModifyEmployeeView(list, selectEmp, new CallBack() {
						@Override
						public void call() {
							table.updateUI();
						}
					}).init();
				} else {
					JOptionPane.showMessageDialog(null, "请选中数据");
				}
			}
		});

		JButton deleteBtn = new JButton();
		deleteBtn.setText("删除");
		deleteBtn.setPreferredSize(new Dimension(80, 30));
		panel3.add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				deleteBatch();
				table.updateUI();

			}
		});

		frame.setVisible(true);
	}

	public void delete() {
		int index = table.getSelectedRow();
		if (index > -1) {
			int option = JOptionPane.showConfirmDialog(null, "确认删除吗", "确认", JOptionPane.YES_NO_OPTION);
			if (option == 0) {
				Employee selectEmp = selectList.get(index);
				list.remove(selectEmp);
				empDao.save(list);
				table.updateUI();
			}
		} else {
			JOptionPane.showMessageDialog(null, "请选中数据");
		}
	}

	public void deleteBatch() {
		int[] indexs = table.getSelectedRows();
		if (indexs.length > 0) {
			int option = JOptionPane.showConfirmDialog(null, "确认删除吗", "确认", JOptionPane.YES_NO_OPTION);
			if (option == 0) {
				for (int i = indexs.length - 1; i >= 0; i--) {
					Employee selectEmp = selectList.get(indexs[i]);
					list.remove(selectEmp);
				}

				empDao.save(list);
				table.updateUI();
			}
		} else {
			JOptionPane.showMessageDialog(null, "请选中数据");
		}
	}

	public static void main(String[] args) {
		new EmployeeView().init();
	}
}
