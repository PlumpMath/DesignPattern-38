package com.mm.cow;

public class Cow {
	private int age=0;
	public Cow(int age){
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void born(){
		Farm farm=Farm.getInstance();
		if(this.age>4)
			farm.add();
	}
	public void pass(){
		
		this.age++;
		born();
	}
}
