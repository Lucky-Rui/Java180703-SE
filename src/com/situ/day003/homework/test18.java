package com.situ.day003.homework;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class test18 {
	@Test
	public void test01() {
		// 输入三个整数x,y,z，请把这三个数由小到大输出
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个整数：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int temp;
		while (true) {
			if (a > b) {
				temp = b;
				b = a;
				a = temp;
			}
			if (b > c) {
				temp = c;
				c = b;
				b = temp;
			}
			if (a < b && b < c) {
				break;
			}
		}
		System.out.println(a + "<" + b + "<" + c);
	}

	@Test
	public void test02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====三个整数比较大小====");
		int[] array = new int[3];
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			array[i] = scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i : array) {
			System.out.println(i);
		}

	}

	@Test
	public void test03() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====三个整数比较大小====");
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
