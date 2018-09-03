package com.situ.day011.study;

import org.junit.Test;

public class StringDemo {
	@Test
	public void test01() {
		String str1 = "Hello";
		String str2 = "Java";
		String str3 = "Android";
		String str4 = "Python";
		String str = str1 + str2 + str3;
		System.out.println(str);

		StringBuilder builder = new StringBuilder(str1);// Hello
		builder.append(str2);// HelloJava
		builder.append(str3);// HelloJavaAndroid
		builder.append(str4);// HelloJavaAndroidPython
		System.out.println(builder);

		// 链式编程
		StringBuilder builder2 = new StringBuilder(str1);
		builder2.append(str2).append(str3).append(str4);
		System.out.println(builder2);

	}

	// @Override
	// public StringBuilder append(String str) {
	// super.append(str);
	// return this;
	// }

}