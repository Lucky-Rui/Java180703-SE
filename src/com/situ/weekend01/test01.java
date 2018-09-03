package com.situ.weekend01;

class test01 {
	public static void main(String[] args) {
//		打印下面图形
//		*****
//		****
//		***
//		**
//		*
		for(int i= 1; i<=5;i++){
			for (int j =5; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
