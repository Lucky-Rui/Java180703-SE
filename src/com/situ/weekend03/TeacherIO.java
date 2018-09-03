package com.situ.weekend03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TeacherIO {
	public List<Teacher> loadDate() {
		ObjectInputStream objectInputStream = null;
		List<Teacher> list = new ArrayList<Teacher>();
		try {
			FileInputStream fileInputStream = new FileInputStream("d:/test/weekend03-teacher.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			list = (List<Teacher>) objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public void save(List<Teacher> list) {
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("d:/test/weekend03-teacher.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
