package com.nancy.innerclass;

public class Person {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat(Food food) {
		System.out.println(String.format("This is the taste£º %s of the food that %s like to eat.", food.whatTaste(), this.name));
	}

}
