package org.petpals.main;

import java.util.Scanner;
import org.petpals.dao.*;

public class MainModule {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PetpalsDaoInf pt = new PetpalsDao();

        while (true) {
            System.out.println("\n--- PetPals Management Menu ---");
            System.out.println("1. List Available Pets");
            System.out.println("2. Record Donation");
            System.out.println("3. List Upcoming Events");
            System.out.println("4. Register Participant for Event");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                	pt.displayPets();
                    break;

                case 2:
                	System.out.println("Enter Donor Name: ");
                    String name = scan.next();

                    System.out.println("Enter Donation Amount: ");
                    float amount = scan.nextFloat();

                    System.out.println("Enter Donation Type: ");
                    String type = scan.next();

                    System.out.println(pt.donationRecording(name, type, amount) + " Rows Inserted");
                    break;

                    
                case 3:
                	pt.displayEvents();
                	break;

                case 4:
                	 System.out.println("Enter Name: ");
                     String participant = scan.next();

                     System.out.println("Enter Type: ");
                     String participantType = scan.next();

                     System.out.println("Enter Event id: ");
                     int id = scan.nextInt();

                     int t = pt.registerForEvent(participant, participantType, id);
                     System.out.println(t + " Rows Inserted");
                     
                     break;
                     
                 case 5:
                    System.out.println("Exiting...");
                    scan.close();
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

	}

}
