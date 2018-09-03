package com.situ.day002.homewok;

import org.junit.Test;

public class Work02 {
	// 打印正三角形
	// *
	// ***
	// *****
	// *******
	// *********
	// ***********
	@Test
	public void t1() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < 6 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 打印倒三角形
	// ***********
	// *********
	// *******
	// *****
	// ***
	// *
	@Test
	public void t2() {
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 11; k >= 2 * i - 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
