package com.situ.day001.homework.cashregister;

import java.util.Scanner;

class CashRegister {
	public static void main(String[] args) {
		//
		// 1、编写一个收银台收款程序，if
		// 定义输入----单价、数量、金额
		// 定义输出----应收金额、找零
		// 使用double类型变量
		// 2、当总价>=500时候打八折
		// 3、考虑程序出现异常的情况，如：
		// 收款金额小于应收金额
		// 若收款金额大于等于应收金额，则计算找零后输出
		// 若收款金额小于应收金额，输出错误信息。
		//
		Scanner sc1 = new Scanner(System.in);
		System.out.println("单价：");
		double price = sc1.nextDouble();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("数量：");
		double qaulity = sc2.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("收款金额：");
		double CollectionAmount = sc3.nextDouble();
		// CollectionAmount:收款金额
		double ReceivableAmount = price * qaulity;
		// ReceivableAmount:应收金额
		double ChangeAmount;
		// ChangeAmount:找零金额
		if (ReceivableAmount >= 500) {
			ReceivableAmount = ReceivableAmount * 0.8;
			ChangeAmount = CollectionAmount - ReceivableAmount;
			System.out.println("应收金额：" + ReceivableAmount);
			System.out.println("找零金额：" + ChangeAmount);
		} else if (CollectionAmount < ReceivableAmount) {
			System.out.println("error");
		} else {
			ChangeAmount = CollectionAmount - ReceivableAmount;
			System.out.println("应收金额：" + ReceivableAmount);
			System.out.println("找零金额：" + ChangeAmount);
		}

	}

}
