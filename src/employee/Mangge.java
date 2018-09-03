package employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 员工数量固定
// 流程固定 没有用户的选择权
// 数据都是临时存储
// 没有界面
// 功能太少 增删改查
// 代码质量差
public class Mangge {
	List<Employee> emps = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void menu() {
		System.out.println("欢迎使用员工信息管理系统");
		load();
		while (true) {
			System.out.println("1.录入2.展示所有0.退出系统");
			int type = sc.nextInt();
			if (type == 1) {
				input();
			} else if (type == 2) {
				show();
			} else if (type == 0) {
				System.out.println("结束");
				break;
			}
		}
	}

	public void input() {
		while (true) {
			System.out.println("请录入第" + (emps.size() + 1) + "个员工的姓名：");
			String name = sc.next();
			System.out.println("请录入第" + (emps.size() + 1) + "个员工的性别：");
			String sex = sc.next();
			System.out.println("请录入第" + (emps.size() + 1) + "个员工的年龄：");
			int age = sc.nextInt();
			Employee emp = new Employee();
			emp.setName(name);
			emp.setSex(sex);
			emp.setAge(age);
			emps.add(emp);
			save();
			System.out.println("是否继续录入,y/n");
			String type = sc.next();
			if (!type.equals("y")) {
				break;
			}
		}
	}

	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("d:/test/employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emps);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void load() {
		try {
			FileInputStream fis = new FileInputStream("d:/test/emps.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			emps = (List<Employee>) ois.readObject();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void show() {
		for (int i = 0; i < emps.size(); i++) {
			Employee emp = emps.get(i);
			// for (Employee emp : emps) { // 逐元循环 语法糖
			if (emp != null) {
				System.out.println("员工姓名：" + emp.getName() + "  " + "性别：" + emp.getSex() + "  " + "年龄：" + emp.getAge());
			}
		}
	}

	public static void main(String[] args) {
		Mangge m = new Mangge();
		m.menu();
	}
}
