package com.situ.day010.homework;

import org.junit.Test;

public class Split {
	// 使用String类中的split()函数，统计出“this is my homework! I must finish it!”中单词的个数。
	// （注意：单词之间用一个空格来分隔。）
	@Test
	public void test01() {
		String str = "this is my homework! I must finish it!";
		String[] array = str.split(" ");

		// System.out.println(array.length);
		System.out.println("-----");
		int count = 0;
		for (String string : array) {
			count++;
		}
		System.out.println(count);
	}
}
