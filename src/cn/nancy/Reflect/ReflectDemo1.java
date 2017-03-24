package cn.nancy.Reflect;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo1 {

	public static void main(String[] arg) throws Exception {

		Person p = new Person();
		// 3 types to get the Class instance
		Class c = p.getClass();
		Class c1 = Person.class;

		Properties prop = new Properties();
		FileReader fr = new FileReader("./src/class.txt");
		prop.load(fr);
		Class c2 = Class.forName(prop.getProperty("ClassName"));

		// get a Constructor instance by Class instance.
		Constructor con = c1.getDeclaredConstructor(String.class, int.class, String.class);
		Constructor con1 = c2.getDeclaredConstructor();
		// SetAccessible = true -> mean can force access the private method or
		// constructor
		con.setAccessible(true);
		// new a Object instance through Constructor instance.
		Object obj = con.newInstance("Nancy", 20, "Shanghai");
		Object obj1 = con1.newInstance();
		// Get a Method instance by the Object instance with method name.
		Method method1 = c.getDeclaredMethod("Sleep");
		// invoke the method
		method1.invoke(c1);

		// Get a Method instance by the Object instance with method name and
		// Class type of argument
		Method method2 = c1.getDeclaredMethod("Eat", String.class);
		// set force to access this method when method is private
		method2.setAccessible(true);
		// Invoke this method with argument.
		method2.invoke(obj, "Apple");

		Method method3 = c2.getMethod(prop.getProperty("MethodName"));
		method3.invoke(obj1);
		
		//get Fields
		Field f1 = c2.getField("name");
		f1.set(obj1, "Ivan");
		System.out.println(f1);
		String s2 =(String) f1.get(obj1);
		System.out.println(s2+"---");
	}
}
