package com.situ.day014.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.Test;

public class FileIO {
	
	@Test
	public void loadDate() {
		// 加载
		try {
			FileInputStream fileInputStream = new FileInputStream("‪src/com/situ/day014/homework/person.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			ArrayList<Person> list = (ArrayList<Person>) objectInputStream.readObject();
			for (Person person : list) {
				System.out.println(person.getId()+","+person.getName()+","+person.getAge()+","+person.getGender());
			}
			objectInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void saveDate() {
		// 保存
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(1, "张三1", 20, "男"));
		list.add(new Person(2, "张三2", 20, "男"));
		list.add(new Person(3, "张三3", 20, "男"));
		list.add(new Person(4, "张三4", 20, "男"));
		list.add(new Person(5, "张三5", 20, "男"));
		list.add(new Person(6, "张三6", 20, "男"));
		list.add(new Person(7, "张三7", 20, "男"));
		list.add(new Person(8, "张三8", 20, "男"));
		list.add(new Person(9, "张三9", 20, "男"));
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("src/com/situ/day014/homework/person.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
