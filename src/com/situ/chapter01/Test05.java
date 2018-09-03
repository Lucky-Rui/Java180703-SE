package com.situ.chapter01;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 判断闰年
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}
}
