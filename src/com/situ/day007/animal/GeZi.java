package com.situ.day007.animal;

class GeZi extends AbstractBird implements IFly {

	@Override
	public void fly() {
		System.out.println("GeZi.fly()");
	}

	@Override
	public void egg() {
		System.out.println("GeZi.egg()");

	}

	public void message() {
		System.out.println("GeZi.message()");
	}
}
