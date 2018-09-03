package fruit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Scanner;

public class test {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fruit f = load();
		while (true) {
			System.out.println("***************");
			System.out.println("***水果销售系统***");
			System.out.println("1、添加水果");
			System.out.println("2、销售");
			System.out.println("3、进货");
			System.out.println("4、查看库存");
			System.out.println("5、销售记录");
			System.out.println("6、进货记录");
			System.out.println("7、利润计算");
			System.out.print("请选择功能（1-7）：");
			int mark = sc.nextInt();
			switch (mark) {
			case 1:
				sand s = new sand();
				System.out.println("名称");
				s.name = sc.next();
				System.out.println("售价");
				s.price = sc.nextDouble();
				System.out.println("数量");
				s.peso = sc.nextDouble();
				System.out.println("成本价");
				s.cbprice = sc.nextDouble();
				f.list.put(s.name, s);
				break;
			case 2: {
				System.out.println("名称");
				String name = sc.next();
				System.out.println("性别(0男 1女)");
				int sex = sc.nextInt();
				System.out.println("数量");
				double pose = sc.nextDouble();
				double amount = f.sale(name, pose, sex);
				System.out.println("支付：" + amount + "元");
				break;
			}
			case 3: {
				System.out.println("名称");
				String name = sc.next();
				System.out.println("进价");
				double price = sc.nextDouble();
				System.out.println("数量");
				double pose = sc.nextDouble();
				f.enter(name, price, pose);
				break;
			}
			case 4:
				Collection<sand> set = f.list.values();
				for (sand a : set)
					System.out.println(a);
				break;
			case 5:
				for (row r : f.report)
					if (r.type == 0)
						System.out.println(r);
				break;
			case 6:
				for (row r : f.report)
					if (r.type == 1)
						System.out.println(r);
				break;
			case 7:
				double all = 0;
				for (row r : f.report)
					if (r.type == 0) {
						all += r.amount - (r.cbpeso * r.peso);
						System.out.println("总利润：" + all);
					}
				break;
			}
			System.out.print("是否退出？（y/n）");
			if (sc.next().equalsIgnoreCase("y"))
				save(f);
			break;
		}

	}

	private static fruit load() {
		fruit f = new fruit();
		try {
			FileInputStream fo = new FileInputStream("d:test/fruit.situ");
			ObjectInputStream oo = new ObjectInputStream(fo);
			f = (fruit) oo.readObject();
			oo.close();
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	private static void save(fruit f) {
		try {
			FileOutputStream fo = new FileOutputStream("d:test/fruit.situ");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(f);
			oo.close();
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
