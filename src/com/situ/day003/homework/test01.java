package com.situ.day003.homework;

import org.junit.Test;

public class test01 {
	@Test
	public void test01() {
		// 0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9
		// 求出上面数组中0-9分别出现的次数
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 0) {
				count0 += 1;
			}
			if (score[i] == 1) {
				count1 += 1;
			}
			if (score[i] == 2) {
				count2 += 1;
			}
			if (score[i] == 3) {
				count3 += 1;
			}
			if (score[i] == 4) {
				count4 += 1;
			}
			if (score[i] == 5) {
				count5 += 1;
			}
			if (score[i] == 6) {
				count6 += 1;
			}
			if (score[i] == 7) {
				count7 += 1;
			}
			if (score[i] == 8) {
				count8 += 1;
			}
			if (score[i] == 9) {
				count9 += 1;
			}
		}
		System.out.println("0出现：" + count0 + "次");
		System.out.println("1出现：" + count1 + "次");
		System.out.println("2出现：" + count2 + "次");
		System.out.println("3出现：" + count3 + "次");
		System.out.println("4出现：" + count4 + "次");
		System.out.println("5出现：" + count5 + "次");
		System.out.println("6出现：" + count6 + "次");
		System.out.println("7出现：" + count7 + "次");
		System.out.println("8出现：" + count8 + "次");
		System.out.println("9出现：" + count9 + "次");
	}

	@Test
	public void test02() {
		int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3, 1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };
		int[] countArray = new int[10];
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				countArray[0]++;// 存放零出现的次数
				break;
			case 1:
				countArray[1]++;
				break;
			case 2:
				countArray[2]++;
				break;
			case 3:
				countArray[3]++;
				break;
			case 4:
				countArray[4]++;
				break;
			case 5:
				countArray[5]++;
				break;
			case 6:
				countArray[6]++;
				break;
			case 7:
				countArray[7]++;
				break;
			case 8:
				countArray[8]++;
				break;
			case 9:
				countArray[9]++;
				break;
			default:
				System.out.println("default");
				break;
			}
		}
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(i + "出现的次数:" + countArray[i]);
		}
	}

	@Test
	public void test03() {

	}
}
