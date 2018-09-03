package com.situ.day002.homewok;

public class Work07 {
	public static void main(String[] args) {
		// 使用循环打印100-200之间所有的素数（只能被1和自己整除的数叫素数）
		int j;
		for (int i = 100; i <= 200; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0)
					break;
			}
			if (i == j)
				System.out.print(i + " ");
		}
	}
}
