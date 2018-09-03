package com.situ.day008.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class JiHe {

	@Test
	public void test01() {
		List<Student> list = new ArrayList<>();
		// ArrayList<Student> list = new ArrayList<>();
		Student student1 = new Student(1, "zhangsan1", "Java1");
		Student student2 = new Student(2, "lisi", "ui");
		Student student3 = new Student(3, "wangwu", "html");
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student1);
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("==================");
		Set<Student> set = new HashSet<>();
		// HashSet<Student> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student2);
		for (Student student : set) {
			System.out.println(student);
		}
	}

	@Test
	public void test02() {
		// CN 中华人民共和国 US 美利坚和中国
		// key value
		HashMap<String, String> map = new HashMap<>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚和中国");

		// 根据key，找出这个key对应的值value
		String value1 = map.get("CN");
		System.out.println(value1);

		// Map遍历
		Set<java.util.Map.Entry<String, String>> entrySet = map.entrySet();
		for (java.util.Map.Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key);
			System.out.println("value: " + value);
		}
		System.out.println("-------------");
		// keySet将map里面所有的key放到Set集合
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println("key: " + key);
			String value = map.get(key);
			System.out.println("value: " + value);
		}
	}

}
