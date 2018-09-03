package com.situ.day012.homework.squareroot;

import java.util.Scanner;

class Test2 {
	private double number;

	class NegativeNumberException extends Exception {

		public NegativeNumberException(String string) {
			super(string);
		}

		public double getNumber() {
			return number;
		}

	}

	public  void squareRoot(double number) throws NegativeNumberException {

		if (number > 0) {
			number = Math.sqrt(number);
			System.out.println(number + "," + (-number));
		}
		if (number == 0) {
			System.out.println("0");
		}
		if (number <= 0) {
			throw new NegativeNumberException("数字为负数，没有平方根");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double number = scanner.nextDouble();
		Test2 squareroot = new Test2();
		try {
			squareroot.squareRoot(number);
		} catch (NegativeNumberException e) {
			System.out.println("提示信息：" + e.getMessage());
			e.printStackTrace();
		}
	}
}
