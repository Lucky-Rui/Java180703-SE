package com.situ.weekend02;

class test02 {
//	将一个数组中的数逆序重新存放。
	public static void main(String[] args) {
		int[] array = new int[]{32,54,36,19,34,56,};
		for(int i=0;i<array.length/2;i++)
        {
            int temp;
            temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
		for (int i : array) {
			System.out.print(i+",");
		}
	}
}
