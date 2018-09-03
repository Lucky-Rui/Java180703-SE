package com.situ.weekend03;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * student表格模型类, 表格JTable这个控件和List<Student>之间的适配器
 * 
 * @author viogel4
 *
 */
public class StudentTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 784360317384421582L;

	private List<Student> students;
	private final String[] columns = { "id", "姓名", "性别", "年龄" };

	public StudentTableModel(List<Student> students) {
		this.students = students;
	}

	public void setData(List<Student> students) {
		this.students = students;
	}

	/**
	 * 返回每列的标题
	 */
	@Override
	public String getColumnName(int column) {
		return columns[column];
	}

	/**
	 * 返回行数
	 */
	@Override
	public int getRowCount() {
		return students.size();
	}

	/**
	 * 返回列数
	 */
	@Override
	public int getColumnCount() {
		return columns.length;
	}

	/**
	 * 返回某行某列的值
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// Student student = students.get(rowIndex);
		if (columnIndex == 0) {
			return students.get(rowIndex).getId();
		} else if (columnIndex == 1) {
			return students.get(rowIndex).getName();
		} else if (columnIndex == 2) {
			return students.get(rowIndex).getAge();
		} else if (columnIndex == 3) {
			return students.get(rowIndex).getGender();
		}
		return null;
	}
}
