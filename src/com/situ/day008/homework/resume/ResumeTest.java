package com.situ.day008.homework.resume;

class ResumeTest {
	// 某公司正进行招聘工作，被招聘人员需要填写个人信息，编写“个人简历”的封装类。
	// 包括如下属性和对属性进行操作的方法。
	// String xm;姓名
	// String xb;性别
	// int nl; 年龄
	// String jtzz;家庭住址
	// String xl;学历
	public static void main(String[] args) {
		Resume resume = new Resume("张三", "男", 10, "山东", "大学");
		System.out.println(resume.getXm() + " " + resume.getXb() + " " + resume.getNl() + " " + resume.getJtzz() + " "
				+ resume.getXl());

	}
}
