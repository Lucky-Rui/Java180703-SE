package com.situ.chapter03;

import java.awt.TexturePaint;
import java.util.Scanner;

/**
 * 学生信息管理系统
 * 
 * @author WANGRUI
 *
 */
class StudentManager2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		// 输入学生信息到学生数组里
		inputStudent(students);
		// 打印数组中的学生信息
		printStudent(students);
		// 根据学生信息查询
		searchByCondition(students);
	}

	/**
	 * 传入Student[],读取学生信息封装成Studnet对象放到数组里面
	 * 
	 * @param students
	 */
	public static void inputStudent(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			// for循环输入学生信息
			System.out.println("请输入学生ID：");
			int id = scanner.nextInt();
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生班级: ");
			String className = scanner.next();
			Student student = new Student(id, name, age, className);
			students[i] = student;// 将学生对象放到数组里面
		}
	}

	/**
	 * 打印学生信息。
	 * 
	 * @param students
	 */
	public static void printStudent(Student[] students) {
		// foreach方法,也需要Student中有toString
		// System.out.println("全部学生信息列表：");
		// for (Student i:students) {
		// System.out.println(i);
		// }
		System.out.println("全部学生信息列表：");
		for (int i = 0; i < students.length; i++) {
			// toString打印学生属性
			Student student = students[i];
			System.out.println(student.toString());
		}
	}

	/**
	 * 根据条件查询学生信息
	 * 
	 * @param students
	 */
	public static void searchByCondition(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		// if (;;) { }与while循环一样，通常用while
		while (true) {
			System.out.println("-----------------------");
			System.out.println("学生信息查找（请输入下列序号）");
			System.out.println("1、根据学生id查找");
			System.out.println("2、根据学生姓名查找");
			System.out.println("3、根据学生年龄查找");
			System.out.println("4、根据学生班级查找");
			System.out.println("0、退出程序");
			System.out.println("------------------------");
			int type = scanner.nextInt();
			if (type == 0) {
				System.out.println("程序已退出！！！！！！！！");
				return;
			}
			switch (type) {
			case 1:
				System.out.println("请输入查询的学生id：");
				int idSearch = scanner.nextInt();
				searchById(students, idSearch);
				break;
			case 2:
				System.out.println("请输入查询的学生姓名:");
				String nameSearch = scanner.next();
				searchByName(students, nameSearch);
				break;
			case 3:
				System.out.println("请输入查询的学生年龄：");
				int ageSearch = scanner.nextInt();
				searchByAge(students, ageSearch);
				break;
			case 4:
				System.out.println("请输入查询的学生班级:");
				String classNameSearch = scanner.next();
				searchByClassRoom(students, classNameSearch);
				break;
			default:
				break;
			}
		}
	}

	/**
	 * 根据id搜索
	 * 
	 * @param students
	 * @param idSearch
	 */
	public static void searchById(Student[] students, int idSearch) {
		while (true) {
			if (idSearch == 0) {
				break;
			} else {

				boolean idflag = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					int id = student.getId();
					if (idSearch == id) {
						idflag = true;
						System.out.println(students[i]);
					}
				}
				if (idflag = false) {
					System.out.println("没有该学生的信息！！！！！");
				}
			}
			break;
		}
	}

	/**
	 * 根据姓名搜索
	 * 
	 * @param students
	 * @param nameSearch
	 */
	public static void searchByName(Student[] students, String nameSearch) {
		boolean nameflag = false;// flag=false没有找到
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String name = student.getName();
			if (nameSearch.equals(name)) {
				nameflag = true;
				System.out.println(student);
			}
		}
		if (nameflag = false) {// 遍历一次没有找到学生姓名
			System.out.println("没有该学生信息！！！！！");
		}
	}

	/**
	 * 根据年龄搜索
	 * 
	 * @param students
	 * @param ageSearch
	 */
	public static void searchByAge(Student[] students, int ageSearch) {
		boolean ageflag = false;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			int age = student.getAge();
			if (ageSearch == age) {
				System.out.println(student);
				ageflag = true;
			}
		}
		if (ageflag = false) {
			System.out.println("没有该学生的信息！！！！！");
		}
	}

	/**
	 * 根据班级搜索
	 * 
	 * @param students
	 * @param classNameSearch
	 */
	public static void searchByClassRoom(Student[] students, String classNameSearch) {
		boolean classNameflag = false;// flag=false没有找到
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String className = student.getClassName();
			if (classNameSearch.equals(className)) {
				classNameflag = true;
				System.out.println(student);
			}
		}
		if (classNameflag = false) {
			System.out.println("没有该学生的信息！！！！！");
		}
	}
}
