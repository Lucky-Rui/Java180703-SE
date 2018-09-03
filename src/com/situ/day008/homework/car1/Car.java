package com.situ.day008.homework.car1;

class Car {
	// 编写一个Java程序，并满足如下要求：
	// 1）编写一个Car类，具有：
	// 属性：品牌(mark)——String类型
	// 功能：驾驶（void drive( )）
	// 2）定义Car类的子类SubCar，具有：
	// 属性：价格（price）、速度（speed）——int型
	// 功能：变速（void speedChange(int newSpeed)），把新速度赋给speed
	// 3）定义主类E，在其main方法中创建SubCar类的两个对象：aodi和benchi的对象并测试其对象的特性。

	String mark;

	public void drive() {
		System.out.println("本车正在驾驶");
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
