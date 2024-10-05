package org.petpals.entity;

import java.util.ArrayList;

public class PetShelter {
	
	ArrayList<Pet> availablePets;

	public PetShelter() {
		availablePets = new ArrayList<Pet>;
	}
	
	public void AddPet(Pet pet) {
		availablePets.add(pet);
		System.out.println("Pet Added to Available Pets List");
	}
	
	public void RemovePet(Pet pet) {
		if (availablePets.remove(pet))
			System.out.println("Pet Removed from  Available Pets List");
	}
	
	public void ListAvailablePets() {
		for (Pet p: availablePets) {
			System.out.println(p.toString());
		
		}
	}

}
