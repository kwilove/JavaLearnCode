package com.hand.HelloWorld;

class Person {
	private String name;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Student extends Person {
	public Student() {}
	public Student(String name) {
		super(name);
	}
}

public class Construct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person();
		new Student();
	}

}
