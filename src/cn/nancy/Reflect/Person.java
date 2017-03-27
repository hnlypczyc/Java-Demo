package cn.nancy.reflect;

public class Person {

	public String name;
	private int age;
	String address;

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public static void Sleep() {
		System.out.println("Sleeping...");
	}

	public void Eat(String str) {
		System.out.println("Eating--> " + str);
	}

}
