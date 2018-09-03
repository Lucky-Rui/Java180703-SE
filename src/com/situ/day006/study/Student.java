package com.situ.day006.study;

class Student extends Person {
	private int id;
	private int age;
	private String name;
	private String className;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student(int id, int age, String name, String className) {
		super(id, age, className);
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", className=" + className + "]";
	}

}
