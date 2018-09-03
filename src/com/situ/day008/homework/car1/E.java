package com.situ.day008.homework.car1;

class E {
	// 3）定义主类E，在其main方法中创建SubCar类的两个对象：aodi和benchi的对象并测试其对象的特性。
	public static void main(String[] args) {
		SubCar aodi = new SubCar();
		aodi.setMark("奥迪");
		System.out.println("本车的品牌是" + aodi.getMark());
		aodi.setPrice(50);
		System.out.println("奥迪车的价格是" + aodi.getPrice());
		aodi.setSpeed(80);
		System.out.println("奥迪车原来的速度是" + aodi.getSpeed());
		aodi.drive();
		aodi.speedChange(120);
		System.out.println("奥迪车现在的速度是" + aodi.speedChange(120));
		System.out.println();
		SubCar benchi = new SubCar();
		benchi.setMark("奔驰");
		System.out.println("本车的品牌是" + benchi.getMark());
		benchi.setPrice(100);
		System.out.println("奔驰车的价格是" + aodi.getPrice());
		benchi.setSpeed(90);
		System.out.println("奔驰车原来的速度是" + benchi.getSpeed());
		benchi.drive();
		benchi.speedChange(120);
		System.out.println("奔驰车现在的速度是" + benchi.speedChange(120));
	}

}
