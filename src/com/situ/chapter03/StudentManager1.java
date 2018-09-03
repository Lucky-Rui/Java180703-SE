package com.situ.chapter03;

import java.util.ArrayList;
import java.util.Scanner;

class StudentManager1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		ArrayList<Student> list = new ArrayList<>();
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入学生ID：");
			int id = scanner.nextInt();
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生班级: ");
			String className = scanner.next();
			Student Student = new Student(id, name, age, className);
			list.add(Student);
		}
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
// for (int i = 0; i < students.length; i++) {
// // for循环输入学生信息
// System.out.println("请输入学生ID：");
// int id = scanner.nextInt();
// System.out.println("请输入学生姓名：");
// String name = scanner.next();
// System.out.println("请输入学生年龄：");
// int age = scanner.nextInt();
// System.out.println("请输入学生班级: ");
// String className = scanner.next();
// Student student = new Student(id, name, age, className);
// // 将学生对象放到数组里面
//// students[i] = student;
// }

// foreach方法,也需要Student中有toString
// System.out.println("全部学生信息列表：");
// for (Student i:students) {
// System.out.println(i);
// }

// System.out.println("全部学生信息列表：");
// for (int i = 0; i < students.length; i++) {
// // toString打印学生属性
// Student student = students[i];
// System.out.println(student.toString());
// }

// if (;;) { }与while循环一样，通常用while
// while (true) {
// System.out.println("-----------------------");
// System.out.println("学生信息查找（请输入下列序号）");
// System.out.println("1、根据学生id查找");
// System.out.println("2、根据学生姓名查找");
// System.out.println("3、根据学生年龄查找");
// System.out.println("4、根据学生班级查找");
// System.out.println("0、退出程序");
// System.out.println("------------------------");
// int type = scanner.nextInt();
// if (type == 0) {
// System.out.println("程序已退出！！！！！！！！");
// return;
// }
// switch (type) {
// case 1:
// System.out.println("请输入查询的学生id：");
// int idSearch = scanner.nextInt();
// boolean idflag = false;
// for (int i = 0; i < students.length; i++) {
// Student student = students[i];
// int id = student.getId();
// if (idSearch == id) {
// System.out.println(students[i]);
// idflag = true;
// }
// }
// if (idflag = false) {
// System.out.println("没有该学生的信息！！！！！");
// }
// break;
// case 2:
// System.out.println("请输入查询的学生姓名:");
// String nameSearch = scanner.next();
// boolean nameflag = false;// flag=false没有找到
// for (int i = 0; i < students.length; i++) {
// Student student = students[i];
// String name = student.getName();
// if (nameSearch.equals(name)) {
// nameflag = true;
// System.out.println(student);
// }
// }
// if (nameflag = false) {// 遍历一次没有找到学生姓名
// System.out.println("没有该学生信息！！！！！");
// }
// break;
// case 3:
// System.out.println("请输入查询的学生年龄：");
// int ageSearch = scanner.nextInt();
// boolean ageflag = false;
// for (int i = 0; i < students.length; i++) {
// Student student = students[i];
// int age = student.getAge();
// if (ageSearch == age) {
// System.out.println(student);
// ageflag = true;
// }
// }
// if (ageflag = false) {
// System.out.println("没有该学生的信息！！！！！");
// }
// break;
// case 4:
// System.out.println("请输入查询的学生班级:");
// String classNameSearch = scanner.next();
// boolean classNameflag = false;// flag=false没有找到
// for (int i = 0; i < students.length; i++) {
// Student student = students[i];
// String className = student.getClassName();
// if (classNameSearch.equals(className)) {
// classNameflag = true;
// System.out.println(student);
// }
// }
// if (classNameflag = false) {
// System.out.println("没有该学生的信息！！！！！");
// }
// break;
// default:
// break;
// }
// }
// }
// }
