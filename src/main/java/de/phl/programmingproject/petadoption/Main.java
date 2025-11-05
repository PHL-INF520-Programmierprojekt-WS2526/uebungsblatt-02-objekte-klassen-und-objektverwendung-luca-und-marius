package de.phl.programmingproject.petadoption;

import java.util.Date;

/**
 * PUT YOUR CODE FOR THE EXERCISE 'Pet Adoption Center' HERE.
 */
public class Main {
    public static void main(String[] args) {
        Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");                                        // Aufgabe 1
                                                                            
        Adopter jane = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");            // Aufgabe 2

        System.out.println(buddy.getInfo());                                                                          // Aufgabe 3

        System.out.println(jane.getInfo());                                                                           // Aufgabe 4

        System.out.println(buddy.isAdopted());                                                                        // Aufgabe 5

        Adoption adoption = buddy.adopt(jane, new Date());                                                            // Aufgabe 6

        System.out.println(adoption.getInfo());                                                                       // Aufgabe 7

        System.out.println(buddy.isAdopted());                                                                        // Aufgabe 8
    }
}
