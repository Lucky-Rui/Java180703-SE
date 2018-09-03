package com.situ.day006.homework.vehicle;

import java.awt.CardLayout;
import java.util.Scanner;

class VehicleTest {
	// 请定义一个交通工具(Vehicle)的类，其中有:
	// 属性：速度(speed)，体积(size)等等
	// 方法：移动(move())，加速speedUp(),减速speedDown()等等.
	// 最后在测试类VehicleTest中的main()中实例化一个交通工具对象，
	// 并通过方法给它初始化speed,size的值，并且通过get方法打印出来。
	// 另外，调用加速，减速的方法对速度进行改变（改变speed的值），
	// 改变后的速度值在main()方法中打印出来。
	public static void main(String[] args) {
		// 实例化一个交通工具对象car
		Scanner scanner = new Scanner(System.in);
		getCar(scanner);
	}

	public static void getCar(Scanner scanner) {
		System.out.println("输入速度（km/h）：");
		double speed = scanner.nextDouble();
		System.out.println("输入体积（kg）：");
		double size = scanner.nextDouble();
		System.out.println(" 输入需加速的值（km/h）：");
		double up = scanner.nextDouble();
		System.out.println(" 输入需减速的值（km/h）：");
		double down = scanner.nextDouble();
		Vehicle car = new Vehicle(speed, size);
		car.getSpeed();
		car.getSize();
		car.speedUp(up);
		;
		car.speedDown(down);
	}

}
