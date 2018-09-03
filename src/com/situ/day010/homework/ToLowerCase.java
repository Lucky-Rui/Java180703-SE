package com.situ.day010.homework;

import org.junit.Test;

public class ToLowerCase {
	// 把“I Love Java！”的字符全部转换为小写并输出到控制台。
	@Test
	public void test01() {
		String str = "I LOVE JAVA!";
		System.out.println(str.toLowerCase());
	}

	@Test
	public void test02() {
		String str = "I LOVE JAVA!";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			}
		}
		String s = new String(arr);
		System.out.println(arr);
		for (char c : arr) {
			System.out.print(c);
		}

	}
}
