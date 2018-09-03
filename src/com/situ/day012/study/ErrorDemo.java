package com.situ.day012.study;

class ErrorDemo {
	// Exception in thread "main" java.lang.StackOverflowError 栈溢出错误
	public static void main(String[] args) {
		fun();
	}

	private static void fun() {
		System.out.println("ErrorDemo.fun() start");
		fun();
		System.out.println("ErrorDemo.fun() end");
	}
}
