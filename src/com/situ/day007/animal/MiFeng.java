package com.situ.day007.animal;

class MiFeng extends AbstractInsect implements IFly {

	@Override
	public void chanluan() {
		System.out.println("MiFeng.chanluan()");
	}

	@Override
	public void fly() {
		System.out.println("MiFeng.fly()");

	}

}
