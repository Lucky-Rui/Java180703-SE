package com.situ.weekend01;

import java.util.Scanner;

class test02 {
	public static void main(String[] args) {
		// 编写一个方法求s=a+aa+aaa+a...a，其中a是一个数，
		// 比如a=2；那么求s=2+22+222+2222...的值。
		// 该方法需要两个参数，第一个参数控制a，第二个参数控制有多少个数。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1~9其中一个数：");
		int a = scanner.nextInt();
		int b = a;
		int sum = 0;
		System.out.println("请输入相加的个数：");
		int numa = scanner.nextInt();
		for (int i = 1; i < numa; i++) {
			a = b + a * 10;
			sum += a;
		}
		System.out.println("和为：" + (sum + b));
	}

}
