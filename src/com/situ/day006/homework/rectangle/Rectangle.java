package com.situ.day006.homework.rectangle;

import java.util.Scanner;

class Rectangle {
	// 定义长方形类，含：
	// 属性：宽、高（整型）；
	// 方法：求周长、面积；
	// 构造方法3个：
	// （1）无参——宽、高默认值为1；
	// （2）1个参数——宽、高相等；
	// （3）2个参数——宽、高各为参数值。
	// 要求：进行测试计算周长和面积

	private int width;// width:宽度
	private int length;// length:长度

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Text(scanner);
	}

	public static void Text(Scanner scanner) {
		System.out.println("请输入长度 ：");
		int length = scanner.nextInt();
		System.out.println("请输入宽度：");
		int width = scanner.nextInt();
		Rectangle rectangle = new Rectangle(width, length);
		System.out.println("周长为：" + rectangle.GetPerimeter(width, length));
		System.out.println("面积为：" + rectangle.GetArea(width, length));
	}

	// 无参构造方法 ，宽、高默认值为1；
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}

	// 1个参数——宽、高相等；
	public Rectangle(int width) {
		this.width = width;
		this.length = width;
	}

	// 1个参数——宽、高相等；
	// public Rectangle(int length) {
	// super();
	// this.length = length;
	// }

	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	// 周长计算方法：2个参数——宽、高各为参数值。
	public int GetPerimeter(int width, int length) {
		this.width = width;
		this.length = length;
		return (this.length + this.width) * 2;
	}

	// 面积计算方法：2个参数——宽、高各为参数值。
	public int GetArea(int width, int length) {
		this.width = width;
		this.length = length;
		return (this.length * this.width);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
