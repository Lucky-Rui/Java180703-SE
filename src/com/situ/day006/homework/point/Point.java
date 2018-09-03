package com.situ.day006.homework.point;

import java.util.Scanner;

class Point {
	// 定义一个点类Point，包含两个成员变量x和y，分别表示x和y坐标，
	// 2个构造函数Point()和Point(int x, int y)，
	// 以及一个movePoint(int dx, int dy)方法实现点的移动（参数即为移动的大小），
	// 移动完成之后直接打印最新的坐标值。
	private int x = 0;
	private int y = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入dx：");
		int dx = scanner.nextInt();
		System.out.println("请输入dy：");
		int dy = scanner.nextInt();
		Point point = new Point();
		// point.movePoint(dx, dy);
		// System.out.println(point);
		System.out.println("移动后的坐标为：" + point.movePoint(dx, dy));
	}

	// 方法：movePoint(int dx, int dy)
	public String movePoint(int dx, int dy) {
		this.x = dx + x;
		this.y = dy + y;
		return ("(" + this.x + "," + this.y + ")");
	}

	// 构造函数Point(int x, int y)，
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 构造函数Point()
	public Point() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
