package org.petpals.exception;

class PetAgeException extends Exception {
    public PetAgeException (String s) {
        super(s);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        PetShelter pt = new PetShelter();
        String name = "Blacky";
        String breed = "Pug";
        int age;
        try {
            age = scan.nextInt();
            if (age < 0)
                throw new PetAgeException("Age should be Positive Number");
            pt.AddPet(new Pet(name, age, breed));
        }
        catch (PetAgeException ex) {
            System.out.println("Caught Exception");
            System.out.println(ex.getMessage());
        }
    }    
}

