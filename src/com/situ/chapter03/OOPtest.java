package com.situ.chapter03;

import java.util.Scanner;

import org.junit.Test;

public class OOPtest {
	@Test
	public void test01() {
		// String str1 = "王瑞";
		// String str2 = new String("java");
		// int num = 3;
		// int st1;
		//
		// Student st;
		// st = new Student();

		Student student = new Student();
		student.id = 001;
		student.name = "张三";
		student.age = 20;
		student.className = "Java1807";
		System.out.println(student.toString());

		Teacher teacher = new Teacher();
		teacher.id = 002;
		teacher.name = "李四";
		teacher.age = 30;
		teacher.salary = 10000;
		teacher.teach();

		Teacher teacher2 = new Teacher();
		teacher2.id = 003;
		teacher2.name = "王五";
		teacher2.age = 32;
		teacher2.salary = 13000;
		teacher2.teach();
	}

	@Test
	public void test02() {
		System.out.println("请输入学生的数量：");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		for (int i = 0; i < students.length; i++) {
			// Student student = students[i];//null
			Student student = new Student();
			System.out.println("请输入学生id：");
			student.id = scanner.nextInt();
			System.out.println("请输入学生的姓名：");
			student.name = scanner.next();
			System.out.println("请输入学生的年龄:");
			student.age = scanner.nextInt();
			System.out.println("请输入学生的班级： ");
			student.className = scanner.next();
			// 将学生对象放到数组里面
			students[i] = student;
		}

		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println("id: " + student.id);
			System.out.println("name: " + student.name);
		}

	}

	@Test
	public void test03() {

	}

}
