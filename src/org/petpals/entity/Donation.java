package org.petpals.entity;

public abstract class Donation {

	protected String donorName;
	protected float amount;

	public Donation() {
		donorName = "";
		amount = 0;
	}

	public Donation(String donorName, float amount) {
		super();
		this.donorName = donorName;
		this.amount = amount;
	}

	public abstract void RecordDonation();

}
