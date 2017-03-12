package com.nancy.innerclass.homework;

public abstract class HomeWork {

	protected Boolean isDone = new Boolean(false);

	public abstract String getName();
	
	public boolean isDone(){
		return this.isDone;
	}
	
	public void setDone(boolean done){
		this.isDone = done;
	}

}
