package employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ModifyEmployeeView extends SuperEmployeeView {
//	修改的方法
	
	List<Employee> list;
	CallBack callBack;
	Employee selectEmp;

	public ModifyEmployeeView(List<Employee> emps, Employee selectEmp, CallBack callBack) {
		this.list = emps;
		this.callBack = callBack;
		this.selectEmp = selectEmp;
	}

	public void init() {
		super.init();
		nameText.setText(selectEmp.getName());
		sexBox.setSelectedItem(selectEmp.getSex());
		ageText.setText(String.valueOf(selectEmp.getAge()));

		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameText.getText();
				String sex = (String) sexBox.getSelectedItem();
				int age = Integer.parseInt(ageText.getText());

				selectEmp.setName(name);
				selectEmp.setSex(sex);
				selectEmp.setAge(age);
				EmployeeDao empDao = new EmployeeDao();
				empDao.save(list);
				frame.dispose();
				callBack.call();

			}
		});

	}
}
