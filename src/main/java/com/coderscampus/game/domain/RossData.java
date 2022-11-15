package com.coderscampus.game.domain;

public class RossData {

	private String name;
	private int age;
	private char gender;

	public RossData() {
		super();
	}

	public RossData(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public RossData(String name) {
		super();
		this.name = name;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RossData [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}
