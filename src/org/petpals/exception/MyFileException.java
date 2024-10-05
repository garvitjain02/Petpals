package org.petpals.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileException {
    public static void main(String[] args) {
        String filename = "pets.txt";  
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(failename));
            String line;

            System.out.println("List of pets in the shelter:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
        } catch (IOException e) {
            System.out.println("Error: Could not read the file '" + filename + "'.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error: Could not close the file reader.");
                }
            }
        }
    }
}
