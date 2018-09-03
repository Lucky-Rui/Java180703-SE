package com.situ.day008.homework.bank;

import java.util.Scanner;

class Bank {
	// 编写程序，模拟银行账户功能。要求如下：
	// 属性：账号（account）、储户姓名(name)、地址(address)、
	// 属性：存款余额(balance)、最小余额(minBalance)
	// 方法：存款(deposit)、取款(withdraw)、查询(query)
	// 根据用户操作显示储户相关信息。
	// 如存款操作后，显示储户原有余额、今日存款数额及最终存款余额；
	// 取款时，若最后余额小于最小余额，拒绝取款，并显示“至少保留余额：XXX”

	private static void main(String[] args) {
		Bank iBank = new Bank("888888", "王瑞", "山东青岛", 10000000.0, 100.0);
		iBank.show();
	}

	private String account;
	private String name;
	private String address;
	private double balance;
	private double minBalance;

	private Bank(String account, String name, String address, double balance, double minBalance) {
		super();
		this.account = account;
		this.name = name;
		this.address = address;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	// 查询
	private void query() {
		System.out.println("账户余额：" + getBalance() + "元");
	}

	// 存款方法
	private void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入存放金额：");
		double write = scanner.nextDouble();
		System.out.println("存款成功！");
		System.out.println("存款前账户余额：" + getBalance() + "元");
		this.balance = getBalance() + write;
		System.out.println("存入金额：" + write);
		System.out.println("存款后账户余额为：" + getBalance() + "元");
	}

	// 取款方法
	private void withdraw() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入取款金额：");
		double read = scanner.nextDouble();
		if (getBalance() - read >= getMinBalance()) {
			System.out.println("取款成功！");
			System.out.println("取款前账户余额：" + getBalance() + "元");
			this.balance = getBalance() - read;
			System.out.println("取出金额：" + read);
			System.out.println("取款后账户余额为：" + getBalance() + "元");
		} else {
			System.out.println("取款失败！当前账户余额：" + getBalance() + "元" + "，至少保留" + getMinBalance() + "元！");
		}
	}

	private void show() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(getName() + "您好！请输入您要选择的操作：");
			System.out.println("1.查询");
			System.out.println("2.存款");
			System.out.println("3.取款");
			System.out.println("4.退卡");
			switch (scanner.nextInt()) {
			case 1:
				query();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("欢迎下次再来");
				return;
			default:
				System.out.println("选择错误！请重新选择");
				break;
			}
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "Bank [account=" + account + ", name=" + name + ", address=" + address + ", balance=" + balance + "]";
	}

}
