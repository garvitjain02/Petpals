package org.petpals.exception;

public class AdoptionException {
	public AdoptionException(String s) {
		super(s);
	}
}

public class Main {
    public static void main(String args[]) {
        ArrayList<String> pets = new ArrayList<String>;
        pets.add("Blacky");
        pets.add("Tommy");
        pets.add("Sheru");

        PetShelter pt = new PetShelter();   
        pt.add("Tommy", null, "Pug");
        pt.add("Sheru", 15, "Pug");     
        
        for (String name: pets)
        {
            try {
                if (pt.contains(name))
                {
                    int pos = pt.availablePets.indexOf(name);
                    if (pt.availablePets[pos].getName() == "" || pt.availablePets[pos].getAge() == 0)
                        throw new AdoptionException("Information Missing of Pet");
                }
                else 
                    throw new AdoptionException("Pet is Not Available for Adoption");
                System.out.println("Pet : " + name + " Adopted Successfully");
            } catch (AdoptionException ex) {
                System.out.println("Caught Exception");
                System.out.println(ex.getMessage());
            }
        }
    }    
}


