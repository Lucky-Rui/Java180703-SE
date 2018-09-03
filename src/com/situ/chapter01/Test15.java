package com.situ.chapter01;

import org.junit.Test;

public class Test15 {
	@Test
	public void m1() {
		// 一到十累乘和
		// Infinity:无限大
		byte i;
		double sum = 1;
		for (i = 1; i < 101; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}

}
