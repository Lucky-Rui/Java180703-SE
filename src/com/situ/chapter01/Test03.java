package com.situ.chapter01;

public class Test03 {

	public static void main(String[] args) {
		// 交换两个变量的值
		byte a = 9;
		byte b = 6;

		byte c;

		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.print("b=" + b);
	}
}
