package com.situ.day008.homework.car1;

class SubCar extends Car {
	// 2）定义Car类的子类SubCar，具有：
	// 属性：价格（price）、速度（speed）——int型
	// 功能：变速（void speedChange(int newSpeed)），把新速度赋给speed

	int price;
	int speed;

	public int speedChange(int newSpeed) {
		return newSpeed;
	}

	// @Override
	// public String toString() {
	// return "本车的品牌是"+mark+"\r"
	// +mark+"车的价格是"+price+"\r"
	// +mark+"车原来的速度是"+speed+"\r"
	// +"本车现在正在驾驶"+"\r"
	// +mark+"车现在的速度是"+speedChange(120);
	// }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public SubCar() {
		super();
		// TODO Auto-generated constructor stub
	}

}
