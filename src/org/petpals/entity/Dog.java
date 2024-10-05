package org.petpals.entity;

public class Dog extends Pet {
	
	private String DogBreed;

	public Dog() {
		DogBreed = "";
	}

	public Dog(String dogBreed) {
		super();
		DogBreed = dogBreed;
	}

	public String getDogBreed() {
		return DogBreed;
	}

	public void setDogBreed(String dogBreed) {
		DogBreed = dogBreed;
	}

	@Override
	public String toString() {
		return "Dog [DogBreed=" + DogBreed + "]";
	}
	
	

}
