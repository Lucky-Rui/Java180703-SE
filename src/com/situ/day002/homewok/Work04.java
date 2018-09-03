package com.situ.day002.homewok;

public class Work04 {
	// 用for循环输出1—1000之间能被5整除的数，且每行输出3个
	public static void main(String[] args) {
		int a = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 == 0) {
				a++;
				System.out.print(i + "\t");
				System.out.print(a % 3 == 0 ? "\n" : "\t");
			}
		}
	}
}
