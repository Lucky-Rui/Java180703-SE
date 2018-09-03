package com.situ.day008.homework.person;

class Student extends Person {
	// （1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
	String schoolName;
	String studentId;

	// 重写工作方法（学生的工作是学习）
	public void work() {
		System.out.println("学生的工作是学习");
	}

}
