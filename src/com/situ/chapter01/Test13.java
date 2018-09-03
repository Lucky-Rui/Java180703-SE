package com.situ.chapter01;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		/**
		 * 学生成绩的等级： >=90 <=100 优秀 >=80 <90 良好 >=70 <80 一般 >=60 <70 及格 <60 不及格
		 *
		 * >100 <0
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的成绩");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("输入的成绩非法");
			return;
		}

		if (score >= 90) {
			System.out.println("优秀");
		} else if (score >= 80) {
			System.out.println("良好");
		} else if (score >= 70) {
			System.out.println("一般");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}
}
