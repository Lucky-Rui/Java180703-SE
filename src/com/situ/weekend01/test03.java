package com.situ.weekend01;

import java.security.acl.Group;

import org.junit.Test;

public class test03 {
	@Test
	public void test01() {
		// 给出一组学生的成绩int[] score={80,45,60,100,89,92,93,...}
		// 请求出这组成绩中，100分，90-99，80-89的学生人数。
		int[] score = new int[] { 80, 45, 60, 100, 89, 92, 93 };
		int count100 = 0;
		int count90 = 0;
		int count80 = 0;
		int count_80 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 100) {
				count100++;
			} else if (score[i] >= 90 && score[i] < 100) {
				count90++;
			} else if (score[i] >= 80 && score[i] < 90) {
				count80++;
			} else {
				count_80++;
			}
		}
		System.out.println("100分的同学有：" + count100 + "人");
		System.out.println("90分的同学有：" + count90 + "人");
		System.out.println("80分的同学有：" + count80 + "人");
		System.out.println("80分以下的同学有：" + count_80 + "人");
	}

	@Test
	public void test02() {
		int[] score = new int[] { 80, 45, 60, 100, 89, 92, 93 };
		s(score);
	}

	public static void s(int[] array) {
		int count100 = 0;
		int count90 = 0;
		int count80 = 0;
		for (int i : array) {
			if (i == 100)
				count100++;
			else if (i >= 90 && i < 100)
				count90++;
			else if (i >= 80 && i < 90)
				count80++;
		}
		System.out.println("100分的同学有：" + count100 + "人");
		System.out.println("90分的同学有：" + count90 + "人");
		System.out.println("80分的同学有：" + count80 + "人");
	}

}
