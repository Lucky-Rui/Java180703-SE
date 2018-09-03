package com.situ.chapter03;

class Student {
	// 属性
	int id;
	String name;
	int age;
	String className;

	// 无参构造方法
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String className) {
		super();
		this.id = id;
		this.name = name;
		this.className = className;
	}

	// 有参构造方法
	public Student(int id, String name, int age, String className) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.className = className;
	}

	// 方法（功能）
	// void study() {
	// System.out.println(className + "班的" + name + "正在学习");
	// }

	// toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", className=" + className + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
