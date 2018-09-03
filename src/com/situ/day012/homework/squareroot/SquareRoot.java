package com.situ.day012.homework.squareroot;

class SquareRoot {
	private double number;

	public void squareRoot(double number) throws NegativeNumberException {

		if (number > 0) {
			number = Math.sqrt(number);
			System.out.println(number + "," + (-number));
		}
		if (number == 0) {
			System.out.println("0");
		}
		if (number <= 0) {
			throw new NegativeNumberException(number);
		}
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

}
