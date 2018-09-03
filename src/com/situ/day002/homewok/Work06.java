package com.situ.day002.homewok;

import java.util.Scanner;

public class Work06 {
	public static void main(String[] args) {
		// 题目：企业发放的奖金根据利润提成。
		// 利润(I)低于或等于10万元时，奖金可提10%；
		// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
		// 20万到40万之间时，高于20万元的部分，可提成5%；
		// 40万到60万之间时高于40万元的部分，可提成3%；
		// 60万到100万之间时，高于60万元的部分，可提成1.5%，
		// 高于100万元时，超过100万元的部分按1%提成，
		// 从键盘输入当月利润，求应发放奖金总数？
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入利润：");
		double I = scanner.nextDouble();
		double bouns;
		double bouns1 = bouns(I);
		System.out.println("奖金为：" + bouns1);
	}

	/**
	 * 计算奖金
	 * 
	 * @param 传入利润I
	 * @return 奖金
	 */
	private static double bouns(double I) {

		double bouns;
		if (I <= 100000) {
			bouns = I * 0.1;
		} else if (I > 100000 && I <= 200000) {
			bouns = 100000 * 0.1 + (I - 100000) * 0.075;
		} else if (I > 200000 && I <= 400000) {
			bouns = 100000 * 0.1 + 100000 * 0.075 + (I - 200000) * 0.05;
		} else if (I > 400000 && I <= 600000) {
			bouns = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + (I - 400000) * 0.03;
		} else if (I > 600000 && I <= 1000000) {
			bouns = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (I - 600000) * 0.015;
		} else {
			bouns = 100000 * 0.1 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015
					+ (I - 1000000) * 0.01;
		}
		return bouns;
	}
}
