package com.situ.day008.homework.person;

class StudentLeaders extends Student {
	// （3）根据学生类，派生一个学生干部类，增加属性：职务；增加方法：开会。

	String position;// 职务

	public void meeting() {
		System.out.println("StudentLeaders.meeting()");
	}

}
