package com.situ.day012.study;

class ExceptionDemo1 {
	// 异常的处理：
	// try {
	// 需要检测的代码(可能会抛出异常，也可能不会抛出异常)
	// } catch (异常的类型 异常类型的变量) {
	// 捕获异常后处理异常
	// } finally {
	// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
	// }
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 1;
		System.out.println("----start---");
		try {
			// 需要检测的代码(可能会抛出异常，也可能不会抛出异常)

			int result = num1 / num2;
		} catch (ArithmeticException e) {
			// 捕获异常后处理异常
			System.out.println("catch ArithmeticException");
			e.printStackTrace();
		} finally {
			// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
			System.out.println("---finally----");
		}
		System.out.println("----end----");

	}
}
