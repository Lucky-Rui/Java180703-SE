package com.situ.day006.homework.calculator;

import java.nio.ShortBuffer;
import java.util.Scanner;

class Number {
	// 编写Java程序，模拟简单的计算器。
	// 定义名为Number的类，其中有两个整型数据成员num1和num2，应声明为私有。
	// 编写构造方法，赋予num1和num2初始值，
	// 再为该类定义加（add）、减（sub）、乘（multi）、除（div）等公有成员方法，
	// 分别对两个成员变量执行加、减、乘、除的运算。
	// 在main方法中创建Number类的对象，调用各个方法，并显示计算结果。

	private int num1;
	private int num2;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数 ：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int num2 = scanner.nextInt();
		Number number = new Number(num1, num2);
		System.out.println(number.add());
		number.sub(num1, num2);
		number.multi(num1, num2);
		number.div(num1, num2);
	}

	// 无参构造方法
	public Number() {
		// TODO Auto-generated constructor stub
	}

	// 编写构造方法，赋予num1和num2初始值
	public Number(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	// 这是一种不好的写法，一个方法尽量去完成一个功能，
	// 这里只想得到相加之后的结果，并没有想打印这个值，
	// 对于要不要打印这个结果，得到值之后再决定打印不打印。
	// public int add(int num1, int num2) {
	// this.num1 = num1;
	// this.num2 = num2;
	// int add = this.num1 + this.num2;
	// System.out.println("num1+num2=" + add);
	// return add;
	// }

	// 加法运算
	public int add() {
		return num1 + num2;
	}
	// 减法运算

	public int sub(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		int sub = this.num1 - this.num2;
		System.out.println("num1-num2=" + sub);
		return sub;
	}

	// 乘法运算
	public int multi(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		int multi = this.num1 * this.num2;
		System.out.println("num1*num2=" + multi);
		return multi;
	}

	// 除法运算
	public int div(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		int div = this.num1 / this.num2;
		System.out.println("num1/num2=" + div);
		return div;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
