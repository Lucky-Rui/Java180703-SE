package com.situ.day012.study;

class ExceptionDemo2 {
	// 多重捕获块（多个catch）
	// try {
	// 需要检测的代码(可能会抛出异常，也可能不会抛出异常)
	// } catch (异常的类型1 异常类型的变量1) {
	// 捕获异常后处理异常
	// } catch (异常的类型2 异常类型的变量2) {
	// 捕获异常后处理异常
	// } catch (异常的类型3 异常类型的变量3) {
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
			int[] array = new int[2];
			array[2] = 3;
		} catch (ArithmeticException e) {
			// 捕获异常后处理异常
			System.out.println("catch ArithmeticException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		} catch (Exception e) {
			// 应该捕获具体的异常，除非实在找不出这个问题，可以用catch(Exception)
			// 保证程序先别崩溃，后面再找原因。
			System.out.println("Exception");
			e.printStackTrace();
		} finally {
			// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
			System.out.println("---finally----");
		}
		System.out.println("----end----");
	}

//	public static void main(String[] args) {
//		int num1 = 3;
//		int num2 = 0;
//		System.out.println("----start---");
//		try {
//			// 需要检测的代码(可能会抛出异常，也可能不会抛出异常)
//			int result = num1 / num2;
//			int[] array = new int[2];
//			array[2] = 3;
//		} catch (Exception e) {// 尽量不要用所有异常的父类来处理所有情况，
//			// 应该捕获具体的异常，除非实在找不出这个问题，可以用catch(Exception)
//			// 保证程序先别崩溃，后面再找原因。
//			System.out.println("Exception");
//			e.printStackTrace();
//		} finally {
//			// 一定会被执行的代码(不管异常抛不抛出都会执行，例如数据库释放连接)
//			System.out.println("---finally----");
//		}
//		System.out.println("----end----");
//	}
}
