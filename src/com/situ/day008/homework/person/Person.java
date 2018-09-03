package com.situ.day008.homework.person;

abstract class Person {
	// 定义一个人类，包括属性：姓名、性别、年龄、国籍；包括方法：吃饭、睡觉，工作。
	// （1）根据人类，派生一个学生类，增加属性：学校、学号；重写工作方法（学生的工作是学习）。
	// （2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。
	// （3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。
	// （4）编写主函数分别对上述3类具体人物进行测试。
	String name;
	String sex;
	int age;
	String nationality;// 国籍

	// 方法：吃饭
	public void eat() {
		System.out.println("Person.eat()");
	}

	// 方法：睡觉
	public void sleep() {
		System.out.println("Person.sleep()");
	}

	// 方法：工作
	public void work() {
		System.out.println("Person.work()");
	}
}
