package org.petpals.entity;

public class ItemDonation extends Donation {
	
	private String ItemType;

	public ItemDonation() {
		ItemType = "";
	}

	public ItemDonation(String itemType) {
		super();
		ItemType = itemType;
	}
	
	public void RecordDonation () {
		System.out.println("Item Donation is being made");
	}


}
