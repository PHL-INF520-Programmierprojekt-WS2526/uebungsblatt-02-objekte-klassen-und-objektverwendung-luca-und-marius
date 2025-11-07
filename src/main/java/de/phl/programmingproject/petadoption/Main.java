

package de.phl.programmingproject.petadoption;

import java.util.Date;


 
 
public class Main {
    public static void main(String[] args) {
        Pet buddy = new Pet("Buddy", 3, "Labrador Retriever");                                                                                                               
        Adopter jane = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");            

        System.out.println(buddy.getInfo());                                                                          

        System.out.println(jane.getInfo());                                                                          

        System.out.println(buddy.isAdopted());                                                                       

        Adoption adoption = buddy.adopt(jane, new Date());                                                            

        System.out.println(adoption.getInfo());                                                                       

        System.out.println(buddy.isAdopted());                                                                        
    }
}
