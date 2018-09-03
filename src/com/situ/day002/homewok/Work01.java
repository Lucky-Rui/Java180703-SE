package com.situ.day002.homewok;

public class Work01 {
	public static void main(String[] args) {
		// 输出一下结构：
		// 1
		// 12
		// 123
		// 1234
		// 12345
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
