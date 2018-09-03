package com.situ.day002.homewok;

import org.junit.Test;

public class Work03 {

	// 计算1-100以内所有奇数的和以及所有偶数的和，分别打印出来。
	@Test
	public void t1() {
		int sum1 = 0;
		for (int j = 1; j < 100; j += 2) {
			sum1 += j;
		}
		System.out.println("奇数和为：" + sum1);
		int sum2 = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum2 += i;
		}
		System.out.println("偶数和为：" + sum2);
	}

	// 计算1-100以内所有奇数的和以及所有偶数的和，分别打印出来。
	@Test
	public void t2() {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("奇数和为：" + sum2);
		System.out.println("偶数和为：" + sum1);
	}
}
