package com.situ.chapter01;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// 两数比较，输出最大
		Scanner a1 = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = a1.nextInt();
		Scanner a2 = new Scanner(System.in);
		System.out.println("输入一个数");
		int b = a2.nextInt();
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}

	}
}
