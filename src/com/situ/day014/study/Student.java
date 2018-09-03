package com.situ.day014.study;

import java.io.Serializable;

class Student implements Serializable {
	private Integer id;
	private String name;
	private Integer age;
	private String banji;

	public Student(Integer id, String name, Integer age, String banji) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.banji = banji;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", banji=" + banji + "]";
	}
	
	

}