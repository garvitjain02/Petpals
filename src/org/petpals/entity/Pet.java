package org.petpals.entity;

public class Pet {
	private String name;
	private int age;
	private String breed;

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

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Pet() {
		name = "";
		age = 0;
		breed = "";
	}

	public Pet(String name, int age, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}
	
}
