package employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public List<Employee> load() {
		//读
		List<Employee> list = new ArrayList<Employee>();
		try {
			FileInputStream fis = new FileInputStream("d:/test/employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<Employee>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void save(List<Employee> list) {
		//写
		try {
			FileOutputStream fos = new FileOutputStream("d:/test/employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
