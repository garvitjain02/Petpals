package org.petpals.dao;

public interface PetpalsDaoInf {

	public void displayPets ();
	public void displayEvents ();
	public int donationRecording (String name, String type, float amount);
	public int registerForEvent (String name, String type, int id);
}
