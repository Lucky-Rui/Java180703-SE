package com.situ.chapter02;

import java.util.Scanner;

import org.junit.Test;

public class Study00 {

	// 输入月份、年份判断天数
	// 1、 3、5、7、8、10、12-------31天
	// 4、6、9、11 --------------------30天
	// 2---------------------------------28/29天
	//
	@Test
	public void test01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		if (month < 0 || month > 12) {
			System.out.println("非法输入");
			return;
		}

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.err.println("30天");
			break;
		case 2:
			// 让 用户输入年份，根据是不是闰年判读多少天
			// if (() || ()) {
			//
			// }
		default:
			System.out.println("非法输入");
			System.out.println("default");
			break;
		}
	}

	// 计算学生成绩的登记，使用switch
	@Test
	public void test02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩:");
		int score = scanner.nextInt();
		if (score < 0 || score > 100) {
			System.out.println("非法的输入");
			return;
		}
		switch (score / 10) {
		case 6:
			System.out.println("及格");
			break;
		case 7:
			System.out.println("一般");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 9:
		case 10:
			System.out.println("优秀");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}

	@Test
	public void test03() {
		int[] array = new int[6];
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		array[3] = 13;
		array[4] = 14;
		array[5] = 15;
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

	}

	@Test
	public void test04() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println(i + " ");
		}
	}

}
