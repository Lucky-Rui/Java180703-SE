package com.situ.day006.homework.vehicle;

class Vehicle {
	// 属性，实体类
	double speed;
	double size;

	public double getSpeed() {
		System.out.println("汽车速度为" + speed);
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		System.out.println("汽车体积为" + size);
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", size=" + size + "]";
	}

	// 无参构造方法
	public Vehicle() {
		super();
	}

	// 有参构造方法
	public Vehicle(double speed, double size) {
		super();
		this.speed = speed;
		this.size = size;
	}

	// 方法：移动move()
	public void move() {

	}

	// 方法:加速speedUp()
	public void speedUp(double up) {
		speed = speed + up;
		System.out.println("加速后的速度为：" + speed);
	}

	// 方法：减速speedDown()
	public void speedDown(double down) {
		speed = speed - down;
		System.out.println("减速后的速度为：" + speed);

	}
}
