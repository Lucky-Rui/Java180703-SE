package com.situ.weekend03;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * student表格模型类, 表格JTable这个控件和List<Student>之间的适配器
 * 
 * @author viogel4
 *
 */
public class TeacherTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 784360317384421582L;

	private List<Teacher> teachers;
	private final String[] columns = { "id", "姓名", "性别", "年龄" };

	public TeacherTableModel(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public void setData(List<Teacher> teachers) {
		this.teachers = teachers;
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
		return teachers.size();
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
		if (columnIndex == 0) {
			return teachers.get(rowIndex).getId();
		} else if (columnIndex == 1) {
			return teachers.get(rowIndex).getName();
		} else if (columnIndex == 2) {
			return teachers.get(rowIndex).getAge();
		} else if (columnIndex == 3) {
			return teachers.get(rowIndex).getGender();
		}
		return null;
	}
}
