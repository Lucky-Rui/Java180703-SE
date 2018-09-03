package com.situ.day011.jioushu;

class JiShuThread extends Thread {
		@Override
		public void run() {
			for (int i = 1; i < 100; i+=2) {
				System.out.println(i);
			}
		}	
		
}