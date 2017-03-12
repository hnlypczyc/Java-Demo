package com.nancy.innerclass.homework;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private static final String SPLIT = ",";

	private String name;

	private StringBuilder problem = new StringBuilder();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<HomeWork> homework;

	public Student(String name) {
		this.name = name;
		this.homework = new ArrayList<>();
	}

	public List<HomeWork> getHomework() {
		return homework;
	}

	public void setHomework(List<HomeWork> homework) {
		this.homework = homework;
	}

	public void addProbleamHomeWork(String name) {
		this.problem.append(name).append(SPLIT);
	}

	public boolean isHomeWorkDoable(HomeWork work) {
		for (String problem : this.problem.toString().split(SPLIT)) {
			if (work.getName().equalsIgnoreCase(problem)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Student do the homework.
	 */
	public void doHomework() {
		System.out.println(String.format("%s Starts do homework.", this.name));
		for (HomeWork work : this.homework) {
			if (isHomeWorkDoable(work)) {
				work.setDone(true);
				System.out.println(String.format("%s - %s is doing homework: %s...", Thread.currentThread().getName(), this.name, work.getName()));
			} else {
				System.err.println(String.format("%s - %s is doing homework: %s..., but met some problem.", Thread.currentThread().getName(), this.name, work.getName()));
			}
		}
		System.out.println(String.format("%s finishes homework.", this.name));
	}

}
