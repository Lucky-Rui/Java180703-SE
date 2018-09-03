package fruit;

import java.io.Serializable;
import java.util.Date;

public class sand implements Serializable{
	
	public sand() {
		
	}
	
	public sand(String name, double peso, double price, double cbprice) {
		super();
		this.name = name;
		this.peso = peso;
		this.price = price;
		this.cbprice = cbprice;
	}

	public sand(String name,double price,double cbprice) {
		super();
		this.name=name;
		this.price=price;
		this.cbprice=cbprice;
	}


	String name;
	double peso;
	double price;
	double cbprice;
	public double sale(double peso,int sex) {
		if(this.peso<peso)peso=this.peso;
		this.peso-=peso;
		row r = new row(0,new Date(),sex,name,peso,cbprice,(sex==1?0.8d:1)*price*peso);
		fruit.report.add(r);
		return r.amount;
	}
	public void enter(double cbprice,double peso) {
		this.cbprice=(this.cbprice*this.peso+cbprice*peso)/(this.peso+peso);
		this.peso+=peso;
		row r = new row(1,new Date(),0,name,peso,cbprice,peso*cbprice);
		fruit.report.add(r);
	}
	@Override
	public String toString() {
		return name+"库存"+peso;
	}
	
}
