package com.situ.day010.study;

import org.junit.Test;

class Static {

	private String name;
	public int age;
	// 静态变量 所有的实例都共享这个变量
	public static String country = "CN";

	public void print() {
		// 实例方法是可以访问静态方法的
		show();
	}

	public static void show() {
		// 静态的方法只能访问静态的方法和静态的属性（因为当前对象的实例可以没有创建，
		// 所以静态的方法是没办法调用非静态的方法和属性的）
		country = "US";
		// age = 45;
		// print();
	}

}
