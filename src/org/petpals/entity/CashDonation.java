package org.petpals.entity;

public class CashDonation extends Donation {

	private String DonationDate;
	
	public CashDonation() {
		DonationDate = "";
	}

	public CashDonation(String donationDate) {
		super();
		DonationDate = donationDate;
	}
	
	public void RecordDonation () {
		System.out.println("Cash Donation is being made");
	}

}
