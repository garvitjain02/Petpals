package org.petpals.exception;

public class InsufficientFundsException {

	public InsufficientFundsException(String s) {
		super(s);
	}
}

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        CashDonation cd;
        String donorName = "Sonu";
        String donationDate = "05-10-2024";
        int amount;
        
        try {
            amount = scan.nextInt();
            if (amount < 10)
                throw new InsufficientFundsException("Donation Amount is Insufficient");
            
            cd = new CashDonation(donorName, amount, donationDate);
        } catch (InsufficientFundsException ex) {
        	
            System.out.println("Caught Exception");
            System.out.println(ex.getMessage());
        }
    }    
}