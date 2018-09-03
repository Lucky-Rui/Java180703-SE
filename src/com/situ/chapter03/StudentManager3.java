package com.situ.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class StudentManager3 {
	@Test
	public void test() {
		String flag = "yes";
		ArrayList<Student> list = new ArrayList<>();
		do {
			Student student = new Student();
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入学生ID：");
			int id = scanner.nextInt();
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生班级: ");
			String className = scanner.next();
			list.add(student);
			System.out.println("是否继续添加学生信息(yes/no)?");
			flag = scanner.next();
		} while (flag.equals("yes"));
		for (Student student : list) {
			System.out.println("全体学生信息：");
			System.out.println(student);
		}

	}

}
