package org.petpals.entity;

import java.util.ArrayList;

public class AdoptionEvent {

	ArrayList<IAdoptable> Participants;
	
	public AdoptionEvent() {
		Participants = new ArrayList<IAdoptable>;
	}

	public void HostEvent() {
		System.out.println("Adoption Event is Hosted");
	}
	
	public void RegisterParticipant (IAdoptable participant) {
		Participants.add(participant);
	}
}
