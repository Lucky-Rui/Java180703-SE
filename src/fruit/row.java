package fruit;

import java.io.Serializable;
import java.util.Date;

public class row implements Serializable{
	int type;//0销售      1进货
	Date date;
	int sex;
	String name;
	double peso;
	double cbpeso;
	double amount;
	public row(int type,Date date,int sex,String name,double peso,
			double cbpeso,double amount) {
		super();
		this.type=type;
		this.date=date;
		this.sex=sex;
		this.name=name;
		this.peso=peso;
		this.cbpeso=cbpeso;
		this.amount=amount;
	}
	@Override
	public String toString() {
		return date.toLocaleString()+"   "+(type==0?"销售":"进货")+"数量："+peso+"价格："+cbpeso+"金额:"+amount;
	}
}
