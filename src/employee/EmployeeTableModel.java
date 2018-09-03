package employee;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class EmployeeTableModel extends AbstractTableModel {

	private List<Employee> list;

	public EmployeeTableModel(List<Employee> list) {
		this.list = list;
	}

	public void setList(List<Employee> list) {
		this.list = list;

	}

	public String getColumnName(int column) {
		if (column == 0) {
			return "姓名";
		} else if (column == 1) {
			return "性别";
		} else if (column == 2) {
			return "年龄";
		}
		return "";
	}

	@Override
	public int getRowCount() {
		return list.size();
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return list.get(rowIndex).getName();
		} else if (columnIndex == 1) {
			return list.get(rowIndex).getSex();
		} else if (columnIndex == 2) {
			return list.get(rowIndex).getAge();
		} else {
			return "";
		}
	}

}
