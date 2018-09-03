package com.situ.day003.homework;

public class test02 {
	public static void main(String[] args) {
		// 0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9
		// 要求求出其中的奇数个数和偶数个数。
		int count1 = 0;
		int count2 = 0;
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				count2 += 1;
			} else {
				count1 += 1;
			}
		}
		System.out.println("奇数个数为：" + count1);
		System.out.println("偶数个数为：" + count2);
	}
}
