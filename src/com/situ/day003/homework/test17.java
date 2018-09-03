package com.situ.day003.homework;

import java.util.Scanner;

import org.junit.Test;

public class test17 {
	// 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
	@Test
	public void test01() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入字符：");
		String result = scanner.nextLine();
		char x[] = result.toCharArray();
		int num = 0;
		int chartra = 0;
		int blak = 0;
		int other = 0;
		for (int i = 0; i < x.length; i++) {
			if (Character.isDigit(x[i])) {
				num++;
			} else if (Character.isLetter(x[i])) {
				chartra++;
			} else if (Character.isSpace(x[i])) {
				blak++;
			} else {
				other++;
			}
		}
		System.out.println("有" + x.length + "个字符");
		System.out.println("数字的个数是" + num);
		System.out.println("字母的个数是" + chartra);
		System.out.println("空格的个数是" + blak);
		System.out.println("其他字符的个数是" + other);
	}

	@Test
	public void test02() {
		System.out.println("请输入字符串：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] array = string.toCharArray();
		int digital = 0;
		int character = 0;
		int blank = 0;
		int other = 0;
		for (int i = 0; i < array.length; i++) {
			char ch = array[i];
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				character++;
			} else if (ch >= '0' && ch <= '9') {
				digital++;
			} else if (ch == ' ') {
				blank++;
			} else {
				other++;
			}
		}
		System.out.println("数字个数： " + digital);
		System.out.println("字母个数： " + character);
		System.out.println("空格个数： " + blank);
		System.out.println("其他个数： " + other);

	}
}
