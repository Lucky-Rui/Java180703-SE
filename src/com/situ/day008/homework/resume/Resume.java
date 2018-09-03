package com.situ.day008.homework.resume;

class Resume {
	// 某公司正进行招聘工作，被招聘人员需要填写个人信息，编写“个人简历”的封装类。
	// 包括如下属性和对属性进行操作的方法。
	// String xm;姓名
	// String xb;性别
	// int nl; 年龄
	// String jtzz;家庭住址
	// String xl;学历

	private String xm;
	private String xb;
	private int nl;
	private String jtzz;
	private String xl;

	public Resume(String xm, String xb, int nl, String jtzz, String xl) {
		super();
		this.xm = xm;
		this.xb = xb;
		this.nl = nl;
		this.jtzz = jtzz;
		this.xl = xl;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public int getNl() {
		return nl;
	}

	public void setNl(int nl) {
		this.nl = nl;
	}

	public String getJtzz() {
		return jtzz;
	}

	public void setJtzz(String jtzz) {
		this.jtzz = jtzz;
	}

	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}

}
