package com.nancy.innerclass;

public class Main {

	public static void main(String[] args) {
		Person john = new Person("John");
		Food food = new QingJiaoChaoDan();
		john.eat(food);
		
		john.eat(new Food(){

			@Override
			public String whatTaste() {
				return "Sweet Apple";
			}
			
		});
		
		john.eat(() -> {
			System.out.println("Printed in the nested inner class....");
			return "This ia a pear."; 
		});
		
		
	}

}
