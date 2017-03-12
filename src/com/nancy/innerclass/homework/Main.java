package com.nancy.innerclass.homework;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Student john = new Student("John");
		Teacher master = new Teacher("Master");
		master.addStudent(john);
		
		master.assignHomeWork(new HomeWork(){

			@Override
			public String getName() {
				return "Chinese";
			}

		});
		
		master.assignHomeWork(new HomeWork(){

			@Override
			public String getName() {
				return "Math";
			}

		});
		
		john.addProbleamHomeWork("Chinese");
				
		john.doHomework();
//		Thread.sleep(1l);
		master.checkHomeWork();
		
	}
	
	
	
	/**
	 * Objects:
	 * 	Teacher, Student, HomeWork
	 * 
	 * Methods
	 * 	Student -> do -> HomeWork
	 * 	Teacher -> check -> HomeWork
	 *	
	 *	Student owns Homework
	 *	
	 *	Teachers owns Student
	 *
	 * 
	 * 
	 * 
	 */

}
