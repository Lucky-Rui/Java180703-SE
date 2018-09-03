package com.situ.day008.homework.person;

class Test {
	// （4）编写主函数分别对上述3类具体人物进行测试。
	public static void main(String[] args) {
		Person student = new Student();
		// student.eat();
		// student.sleep();
		student.work();

		Person worker = new Worker();
		// worker.eat();
		// worker.sleep();
		worker.work();

		StudentLeaders studentLeaders = new StudentLeaders();
		studentLeaders.eat();
		studentLeaders.sleep();
		studentLeaders.meeting();
	}
}
