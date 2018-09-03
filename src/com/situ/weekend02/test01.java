package com.situ.weekend02;

class test01 {
//	编写一个程序，计算一维数组中的最大值、最小值。
	public static void main(String[] args) {
		int[] array = new int[]{32,54,36,19,34,56,};
		int maxindex = 0;
		int minindex = 0;
		int max = array[maxindex];
		int min = array[minindex];
		for (int i = 0; i < array.length; i++) {
			if (array[i]>max) {
				maxindex = i;
				max = array[i];
			}else if (array[i]<min) {
				minindex = i;
				min = array[i];
			}
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}
}
