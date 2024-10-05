package org.petpals.entity;

public class Cat  extends Pet {
	
	private String CatColor;

	public Cat() {
		CatColor = "";
	}

	public Cat(String catColor) {
		super();
		CatColor = catColor;
	}

	public String getCatColor() {
		return CatColor;
	}

	public void setCatColor(String catColor) {
		CatColor = catColor;
	}

	@Override
	public String toString() {
		return "Cat [CatColor=" + CatColor + "]";
	}

	
}
