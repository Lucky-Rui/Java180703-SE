package com.situ.day011.homework;

import java.util.ArrayList;
import java.util.List;

class ToArray {
	// 实现函数public String[] toArray(List<String> list)，
	// 其中参数list中元素类型为String字符串。
	// 將集合（String類型）轉化為數組
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		String[] array = toArray(list);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static String[] toArray(ArrayList<String> list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}

		return array;

	}
}
