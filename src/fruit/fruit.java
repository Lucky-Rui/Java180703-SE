package fruit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class fruit implements Serializable{
public fruit() {
	list.put("苹果", new sand("苹果", 20, 2.5d, 1.5d));
	list.put("菠萝", new sand("菠萝", 20, 2.5d, 1.5d));
	list.put("橘子", new sand("橘子", 20, 2.5d, 1.5d));
    }
	static ArrayList<row> report = new ArrayList<row>();
	HashMap<String, sand> list = new HashMap<String,sand>();
	
	public double sale(String name,double peso,int sex) 
	{
		return list.get(name).sale(peso,sex);
	}
	
	
	public void enter(String name,double cbprice,double peso) 
	{
		if(!list.containsKey(name))list.put(name, new sand(name,peso,cbprice));
		list.get(name).enter(cbprice,peso);
	}
}
