package com.situ.day014.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class IOTest {

	@Test
	public void objectOutputStreamTest() {
		Student student = new Student(1, "zhangsan", 21, "java1");
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/com/situ/day014/study/person");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
//			ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
//			out.defaultWriteObject();
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

	@Test
	public void objectInputStreamTest() {
		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			inputStream = new FileInputStream("src/com/situ/day014/study/person");
			objectInputStream = new ObjectInputStream(inputStream);
			Object object = objectInputStream.readObject();
			Student student = (Student) object;
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
