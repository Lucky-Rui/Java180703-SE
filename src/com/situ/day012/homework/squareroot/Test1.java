package com.situ.day012.homework.squareroot;

import java.util.Scanner;

class Test1 {
	// 设计自己的异常类表示对负数求平方根的错误；在类Test的主方法中，从键盘输入一个数，
	// 若输入的数不小于0，则输出它的平方根；若小于0，则抛出自定义异常；
	// 在程序中处理异常并输出提示信息“输入错误，不能对负数求平方根”
	private double number;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double number = scanner.nextDouble();
		SquareRoot squareRoot = new SquareRoot();
		try {
			squareRoot.squareRoot(number);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
		}
	}
}
