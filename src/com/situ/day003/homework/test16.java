package com.situ.day003.homework;

import java.util.Scanner;

public class test16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入五位数：");
		String numStr = scanner.next();// "12321"
		char[] numArray = numStr.toCharArray();
		boolean isHuiWen = true;
		for (int i = 0; i < numArray.length / 2; i++) {
			// i=0 numArray.length - 1
			// i=1 numArray.length - i - 1
			if (numArray[i] != numArray[numArray.length - i - 1]) {
				isHuiWen = false;
				break;
			}
		}
		if (isHuiWen == true) {
			System.out.println("这是回文");
		} else {
			System.out.println("这不是回文");
		}

	}

}
