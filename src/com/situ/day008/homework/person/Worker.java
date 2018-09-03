package com.situ.day008.homework.person;

class Worker extends Person {
	// （2）根据人类，派生一个工人类，增加属性：单位、工龄；重写工作方法（工人的工作是……自己想吧）。

	String unit;// 单位
	int LengthOfService;// 工龄

	// 重写工作方法
	public void work() {
		System.out.println("工人的工作是搬砖");
	}
}
