package com.situ.day010.study;

class Teacher {
	private String name;
	private int age;

	// 静态代码块
	static {
		System.out.println("Teacher static");
	}

	public Teacher() {
		System.out.println("Teacher.Teacher()");
	}
}
