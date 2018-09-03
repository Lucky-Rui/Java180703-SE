package employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AddEmployeeView extends SuperEmployeeView {

	List<Employee> list;

	CallBack callBack;

	private static AddEmployeeView instance;

	private AddEmployeeView(List<Employee> list, CallBack callBack) {
		this.list = list;
		this.callBack = callBack;
	}

	public static AddEmployeeView getinstance(List<Employee> list, CallBack callBack) {
		if (instance == null) {
			instance = new AddEmployeeView(list, callBack);
		}
		return instance;
	}

	public void openFrame() {
		if (frame == null) {
			init();
		} else {
			frame.setVisible(true);
		}
	}

	public void init() {
		super.init();
		saveBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String sex = (String) sexBox.getSelectedItem();
				int age = Integer.parseInt(ageText.getText());
				Employee emp = new Employee();
				emp.setName(name);
				emp.setSex(sex);
				emp.setAge(age);
				list.add(emp);
				EmployeeDao empDao = new EmployeeDao();
				empDao.save(list);
				frame.dispose();
				callBack.call();

			}
		});
	}
}
