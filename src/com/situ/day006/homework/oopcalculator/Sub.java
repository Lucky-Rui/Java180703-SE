package com.situ.day006.homework.oopcalculator;

class Sub extends Cal {
	public Sub(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public int getResult() {
		return num1 - num2;
	}
}