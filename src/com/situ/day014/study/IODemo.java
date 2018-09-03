package com.situ.day014.study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class IODemo {
	@Test
	public void fileReaderTest1() {
		try {
			FileReader fileReader = new FileReader("src/com/situ/day014/study/io.txt");
			int ch = -1;
			while ((ch = fileReader.read()) != -1) {
				System.out.print((char) ch + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fileCopy1() {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("src/com/situ/day014/study/file.txt");
			fileWriter = new FileWriter("src/com/situ/day014/study/file_back.txt");
			char[] buffer = new char[10];
			int length = 0;
			while ((length = fileReader.read(buffer)) != -1) {
				// 我读取了多少个就写多少个
				fileWriter.write(buffer, 0, length);
			}
			// fileWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void fileInputStreamCopy() {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream("D://test//1.jpg");
			fileOutputStream = new FileOutputStream("D://test//2.jpg");
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = fileInputStream.read(buffer)) != -1) {
				fileOutputStream.write(buffer, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void objectOutputStreamTest() {
		Student student = new Student(1, "张三", 20, "Java1807");
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("src/com/situ/day014/study/person");
			// ObjectOutputStream依赖于FileOutputStream
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
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

	@Test
	public void objectOutputStreamTest2() {
		Student student = new Student(1, "张三", 15, "Java1807");
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("person");
			// ObjectOutputStream依赖于FileOutputStream
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
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
