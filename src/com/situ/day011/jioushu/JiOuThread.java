package com.situ.day011.jioushu;

class JiOuThread extends Thread{
	 private int start;
	   public JiOuThread(String name, int start) {
	     super(name);//设置线程的名字
	     this.start = start;
	   }
	   @Override
	   public void run() {
	     for (int i = start; i <= 100; i += 2) {
	        System.out.println(Thread.currentThread().getName() + " " + i);
	     }
	   }
	   
}
