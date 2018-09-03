package com.situ.day006.homework.oopcalculator;

import org.junit.Test;

class Cal {
	// 用面向对象实现计算器,继承
	protected int num1;
	protected int num2;

	public static void main(String[] args) {
		// 声明成父类类型，new子类类型
		Cal cal;
		cal = new Add(3, 5);
		int result1 = cal.getResult();
		System.out.println("两数相加结果为：" + result1);// 8
		cal = new Sub(8, 4);// 所有new出来的子类对象都可以赋给父类
		int result2 = cal.getResult();
		System.out.println("两数相减结果为：" + result2);// 4
		cal = new Mul(8, 4);// 所有new出来的子类对象都可以赋给父类
		int result3 = cal.getResult();
		System.out.println("两数相乘结果为：" + result3);// 32
		cal = new Div(8, 4);// 所有new出来的子类对象都可以赋给父类
		int result4 = cal.getResult();
		System.out.println("两数相除结果为：" + result4);// 2
	}

	// 无参构造方法
	public Cal() {
		// TODO Auto-generated constructor stub
	}

	// 有参构造方法
	public Cal(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// getResult方法
	public int getResult() {
		return 0;
	}
}
