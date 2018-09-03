package com.situ.chapter01;

import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

public class Test00 {
	// 交换两个变量的值
	@Test
	public void m01() {
		byte a = 9;
		byte b = 6;

		byte c;

		c = a;
		a = b;
		b = c;
		System.out.println("a=" + a);
		System.out.print("b=" + b);
	}

	// 三目运算符
	@Test
	public void m02() {
		int num1 = 13;
		int num2 = 5;
		// 语法：boolean ? 数1 ： 数2;
		int max = num1 > num2 ? num1 : num2;
		System.out.println("max: " + max);
	}

	// 循环打印
	@Test
	public void m03() {
		int x = 10;
		while (x < 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.print("\n");
		}
	}

	// 1+2+3+....+100=?
	@Test
	public void m04() {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("sum=" + sum);
	}

	// 打印1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
	@Test
	public void m05() {
		int i = 1;
		int sum = 1;
		while (i < 10) {
			sum = i * 9;
			System.out.print(i + "*9=" + sum + " ");
			i++;
		}
	}

	// 打印1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81
	@Test
	public void m06() {
		int i = 1;
		int sum = 1;
		for (i = 1; i <= 9; i++) {
			sum = i * 9;
			System.out.print(i + "*9=" + sum + " ");
		}
	}

	// 九九乘法表正序
	@Test
	public void m07() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	// 九九乘法表倒序
	@Test
	public void m08() {
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + " ");
			}
			System.out.println();
		}
	}

	// 输出1到100以内所有素数
	@Test
	public void m09() {
		int i;
		int j;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j >= i) {
				System.out.println(i);

			}
		}
	}

	// 输出素数
	@Test
	public void m10() {

		System.out.print("2 ");
		boolean bool;
		for (int i = 3; i < 100; i += 2) {
			bool = true;
			for (int j = 3; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					bool = false;
					break;
				}
			}
			if (bool)

				System.out.print(i + " ");
		}
	}

	@Test
	public void m11() {
		Random random = new Random();
		int ran = new Random().nextInt();
		System.out.println(ran);
	}

	// 例题：随机生成一个整数。
	// 用户输入一个整数，程序给出与存储的数字是“大”或者“小”，知道用户猜到这个数字位置。
	// 如果中途用户希望程序退出，输入0可以退出。
	@Test
	public void m12() {
		int random = (int) (Math.random() * 1000 + 1);
		System.out.println("猜吧：");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num != random) {
			if (num > random) {
				System.out.println("大");
			} else if (num < random) {
				System.out.println("小");
			}
			System.out.println("继续猜：");
			num = scanner.nextInt();
		} // 猜对了
		System.out.println("猜对了");

	}

	// 例题：随机生成一个整数。
	// 用户输入一个整数，程序给出与存储的数字是“大”或者“小”，知道用户猜到这个数字位置。
	// 如果中途用户希望程序退出，输入0可以退出。
	@Test
	public void m13() {
		int random = (int) (Math.random() * 1000 + 1);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("猜吧");
			int num = scanner.nextInt();
			if (0 == num) {
				System.out.println("程序退出");
				return;
			}
			if (num > random) {
				System.out.println("大");
			} else if (num < random) {
				System.out.println("小");
			} else {
				System.out.println("猜对了");
				break;
			}

		}
		System.out.println("end");
	}

	@Test
	public void m14() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println(num);
	}

	@Test
	public void m15() {
		int random = (int) Math.random();
		System.out.println(random);
	}

	@Test
	public void m16() {
		int sum = 0;
		for (int i = 1; i < +100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 计算一到一百以内7的倍数的个数
	@Test
	public void m17() {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("个数是：" + count);
	}

	// 三行四列星星
	@Test
	public void m18() {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 三角形
	// *
	// **
	// ***
	// ****
	// *****
	@Test
	public void m00() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
