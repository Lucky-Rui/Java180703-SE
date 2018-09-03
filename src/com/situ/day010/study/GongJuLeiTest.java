package com.situ.day010.study;

class GongJuLeiTest {
	public static void main(String[] args) {
		int[] array = { 3, 44, 5, 65, 167, 79 };
		int max = GongJuLei.max(array);
		System.out.println(max);
		GongJuLei.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
