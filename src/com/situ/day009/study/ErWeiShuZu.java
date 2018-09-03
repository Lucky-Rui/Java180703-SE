package com.situ.day009.study;

import org.junit.Test;

public class ErWeiShuZu {
	// 定义两行三列的二维数组
	int[][] array = new int[2][3];

	@Test
	public void test01() {
		int[] arr1 = new int[3];
		arr1[0] = 3;
		int[] arr2 = { 12, 2, 4 };
		// 定义两行三列的二维数组
		int[][] array1 = new int[2][3];
		array1[0][0] = 3;
		int[][] array2 = { { 2, 4, 5 }, { 2, 4, 7 } };
	}

	@Test
	public void test02() {
		int[][] array = { { 42, 14, 5 }, { 2, 4, 7 } };
		// 定位行（外层循环控制行数）
		for (int i = 0; i < array.length; i++) {
			// 定位每行的元素
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	@Test
	public void test03() {
		int[][] array = new int[3][];// 定义一个三行的二维数组
		array[0] = new int[2];// 为第一行分配两列
		array[1] = new int[3];// 为 第二行分配三列
		array[2] = new int[4];// 为 第三行分配四列
		array[0][0] = 1;// 第一行第一列赋值为1
		array[1][1] = 2;// 第二行第二列赋值为2
		array[2][3] = 3;// 第三行第四列赋值为3
		System.out.println(array[0][0]);
		System.out.println(array[1][1]);
		System.out.println(array[2][3]);
	}

}
