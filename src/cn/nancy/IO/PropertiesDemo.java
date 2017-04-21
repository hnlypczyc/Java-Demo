package cn.nancy.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException, IOException {
		
		Properties prop = new Properties();
		prop.put("001", "Value1");
		prop.put("002", "Value2");
		
		prop.setProperty("003", "SetValue1");
		prop.setProperty("Value3", "SetValue2");
		Set set = prop.keySet();
		for(Object s: set){
			Object value = prop.get(s);
			System.out.println(value);
			
		}
		
		Properties prop1 = new Properties();
		prop1.setProperty("1", "Prop1");
		prop1.setProperty("2", "Prop2");
		prop1.setProperty("3", "Prop3");
		Set<String> set1 = prop1.stringPropertyNames();
		for(String s: set1){
			String value = prop1.getProperty(s);
			System.out.println(value);
		}
//		Set<Object> set =  prop.stringPropertyNames();
		Properties prop2 = new Properties();
		prop.load(new FileReader("prop.txt"));
		
		
		Properties prop3 = new Properties();
		prop3.load(new FileReader("prop.txt"));
		boolean flag =prop3.containsKey("wangwu");
		if (flag = true){
			prop3.setProperty("wangwu", "100");
		prop3.store(new FileWriter("prop.txt"), "Update the wangwu`s value to 100 ");
		}
	}

}
