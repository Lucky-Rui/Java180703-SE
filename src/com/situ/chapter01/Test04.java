package com.situ.chapter01;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 创建两个变量a，b。给他们赋值，书写代码，将两值交换。
		Scanner a1 = new Scanner(System.in);
		System.out.println("输入一个数a");
		int a = a1.nextInt();
		Scanner a2 = new Scanner(System.in);
		System.out.println("输入一个数b");
		int b = a2.nextInt();
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.print("b=" + b);

	}
}
