package com.situ.day010.study;

import java.util.ArrayList;

import org.junit.Test;

public class BaoZhuang {
	public static void main(String[] args) {
		String str = "20";
		// 第一种方式
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		// 第二种方式
		Integer integer = new Integer(str);
		int value2 = integer.intValue();
		System.out.println(value2);
		// xxx value = XXX.parseXXX(String str);
		String str2 = "3.14";
		double d = Double.parseDouble(str2);
		System.out.println(d);
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
	}

	@Test
	public void test01() {
		int[] array = new int[3];
		// ArrayList<int> list = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		// list.add(3.14);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		// int类型最大值
		System.out.println(Integer.MAX_VALUE);

		// 自动拆箱和装箱
		// Integer integer = new Integer(4);
		Integer integer = 4;// 自动装箱，等价于上面操作
		int i = integer.intValue();
		integer = integer + 2;// 自动拆箱, integer.intValue()+2 ，
		// 得到的int类型的6又赋值给Integer类型，自动装箱
		System.out.println(integer);
	}

}
