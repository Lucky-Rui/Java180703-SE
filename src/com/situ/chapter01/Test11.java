package com.situ.chapter01;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// 两数相加
		Scanner a1 = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = a1.nextInt();
		Scanner a2 = new Scanner(System.in);
		System.out.println("输入一个数");
		int b = a2.nextInt();
		int c = a + b;
		System.out.println("c=" + c);
	}
}
