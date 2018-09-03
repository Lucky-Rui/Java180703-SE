package com.situ.day006.homework.oopcalculator;

class Mul extends Cal {
	public Mul(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public int getResult() {
		return num1 * num2;
	}
}
