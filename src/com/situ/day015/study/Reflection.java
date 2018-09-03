package com.situ.day015.study;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class Reflection {
	@Test
	public void ClassTest() throws ClassNotFoundException {
		// 1.Class.forName(类路径)
		Class clazz1 = Class.forName("com.situ.day015.study.Person");
		// 2. 类名.class
		Class clazz2 = Person.class;
		// 3. 对象.getClass();
		Person person = new Person();
		Class clazz3 = person.getClass();

		System.out.println(clazz1 == clazz2);// true
		System.out.println(clazz1 == clazz3);// true
	}

	@Test
	public void constructorTest1() {
//		Class clazz = Person.class;
//		Constructor[] constructors = clazz.getDeclaredConstructors();
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//			System.out.println(constructor.getName());
//			System.out.println(constructor.getModifiers());// 返回值
//		}
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
			System.out.println(constructor.getName());
			System.out.println(constructor.getModifiers());
		}
	}
	
	public void constructorTest2() {
		
	}
	
}
