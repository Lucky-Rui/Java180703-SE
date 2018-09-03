package com.situ.day012.homework.squareroot;

//自定义异常，继承Exception
class NegativeNumberException extends Exception {

	private double number;

	public NegativeNumberException(double number) {
		super("数字为负数，没有平方根");
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

}
