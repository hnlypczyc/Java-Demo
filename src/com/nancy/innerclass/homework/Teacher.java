package com.nancy.innerclass.homework;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private String name;
	
	private List<Student> students;
	
	public Teacher(String name) {
		this.name = name;
		this.students = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		this.students.add(student);
	}
	
	/**
	 * Teacher assign homework.
	 * 
	 * @param homework
	 */
	public void assignHomeWork(HomeWork homework){
		for(Student student : this.students){
			List<HomeWork> homeWorks = student.getHomework();
			homeWorks.add(homework);
		}
	}
	
	
	/**
	 * Teacher check the homework.
	 * @param hw
	 */
	public void checkHomeWork() {
		for(Student student : this.students){
			for(HomeWork work : student.getHomework()){
				if(work.isDone()){
					System.out.println(String.format("%s - %s is checking homework %s from %s...", Thread.currentThread().getName(), this.name, work.getName(), student.getName()));
				} else {
					System.err.println(String.format("%s - %s is checking homework %s from %s..., but unfinished!!! %s", Thread.currentThread().getName(), this.name, work.getName(), student.getName(), System.currentTimeMillis()));
				}
			}
		}
	}
	
}
