package com.situ.day011.homework;

class Kk {
	// 获取一个字符串在另一个字符串中出现的次数。
	// "abkkcdkkefkkskk" "kk"
	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		int countnum = getSubCount(str, key);
		System.out.println("出现" + key + "的次数是：" + countnum);
	}

	public static int getSubCount(String str, String key) {
		int count = 0;
		int index = 0;
		// while ((index = str.indexOf(key)) != -1) {// 如果未出现该字符，则返回 -1
		// str = str.substring((index + key.length()));
		// count++;
		// }
		while ((index = str.indexOf(key, index)) != -1) {
			index = index + key.length();
			count++;
		}
		return count;
	}

}
