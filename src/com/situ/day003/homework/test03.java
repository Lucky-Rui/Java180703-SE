package com.situ.day003.homework;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

public class test03 {
	@Test
	public void test01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("======求学生平均成绩======");
		System.out.println("请输入有多少个学生：");
		int num = scanner.nextInt();
		int[] array = new int[num];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
			array[i] = scanner.nextInt();
			sum += array[i];
		}
		double average = sum / array.length;
		System.out.println("这" + array.length + "个学生的平均分是：" + average);
	}

}
