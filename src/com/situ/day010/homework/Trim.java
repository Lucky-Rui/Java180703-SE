package com.situ.day010.homework;

import org.junit.Test;

public class Trim {
	@Test
	public void test01() {
		// String str = "---java Android---";
		// String str = "---java Android";
		// String str = "java Android---";
		// String str = "------";
		String str = "---java Android---";
		String trimStr = trim(str);
		System.out.println(trimStr);
	}

	public String trim(String str) {
		int startIndex = 0;
		int endIndex = str.length() - 1;
		while ((startIndex <= endIndex) && (str.charAt(startIndex) == '-')) {
			startIndex++;
		}
		while ((startIndex <= endIndex) && (str.charAt(endIndex) == '-')) {
			endIndex--;
		}
		return str.substring(startIndex, endIndex + 1);
	}

	@Test
	public void test02() {
		String string = "    Java andriod  ";
		char[] charArray = string.toCharArray();
		int start = 0;
		int end = 0;
		for (int i = 0; i < charArray.length; i++) {
			char front = charArray[i];
			char rear = charArray[charArray.length - 1 - i];
			if ((front != ' ') && (start == 0)) {
				start = i;
			}

			if ((rear != ' ') && (end == 0)) {
				end = charArray.length - i;
			}

			if ((start != 0) && (end != 0)) {
				break;
			}
		}
		System.out.println("字符串为：");
		System.out.println(string.substring(start, end));
		System.out.println(string.trim());
	}

}
