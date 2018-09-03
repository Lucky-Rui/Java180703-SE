package com.situ.day008.homework.fish;

class Catfish extends FreshwaterFish implements ISwim {
	// 鲶鱼catfish

	@Override
	public void swim() {
		System.out.println("Catfish.swim()");
	}

}
