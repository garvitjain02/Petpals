package org.petpals.entity;

public abstract class IAdoptable {
	
	protected String name;
	
	public IAdoptable() {
		super();
		name = "";
	}
	
	public IAdoptable(String name) {
		super();
		this.name = name;
	}

	public abstract void Adopt();

}
