package de.phl.programmingproject.enrollmentsystem;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Student john = new Student("John Doe", "12345");                            // Aufgabe 1

        Course computerScience = new Course("Introduction to Computer Science");       // Aufgabe 2

        System.out.println(john.getInfo() + computerScience.getInfo());                      // Aufgabe 3

        Enrollment johnComputerScienceEnrollment = john.enroll(computerScience);             // Aufgabe 4

        System.out.println(john.getInfo() + computerScience.getInfo());                      // Aufgabe 5

        System.out.println(johnComputerScienceEnrollment.getInfo());                         // Aufgabe 6

        johnComputerScienceEnrollment.setGrade(4.0);                                  // Aufgabe 7

        System.out.println(johnComputerScienceEnrollment.getInfo());                         // Aufgabe 8

        Course oop = new Course("Object-Oriented Programming");                        // Aufgabe 9

        john.enroll(oop);                                                                    // Aufgabe 10

        System.out.println(john.getCourses());                                               // Aufgabe 11

        System.out.println(computerScience.getStudents());                                   // Aufgabe 12

        john.drop(computerScience);                                                          // Aufgabe 13

        System.out.println(computerScience.getStudents());                                   // Aufgabe 14
    }
}
