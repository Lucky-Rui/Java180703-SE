package com.situ.day011.jioushu;

class OuShuThread extends Thread{
	@Override
	public void run() {
	for (int i = 2; i < 100; i+=2) {
		System.out.println(i);
	}
	}
}
