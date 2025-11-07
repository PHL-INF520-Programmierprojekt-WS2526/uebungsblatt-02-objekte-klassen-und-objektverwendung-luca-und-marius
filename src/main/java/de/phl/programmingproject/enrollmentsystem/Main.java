package de.phl.programmingproject.enrollmentsystem;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Student john = new Student("John Doe", "12345");                           

        Course computerScience = new Course("Introduction to Computer Science");       

        System.out.println(john.getInfo() + computerScience.getInfo());                      

        Enrollment johnComputerScienceEnrollment = john.enroll(computerScience);             

        System.out.println(john.getInfo() + computerScience.getInfo());                      

        System.out.println(johnComputerScienceEnrollment.getInfo());                         

        johnComputerScienceEnrollment.setGrade(4.0);                                  

        System.out.println(johnComputerScienceEnrollment.getInfo());                        

        Course oop = new Course("Object-Oriented Programming");                        

        john.enroll(oop);                                                                   

        System.out.println(john.getCourses());                                               

        System.out.println(computerScience.getStudents());                                  

        john.drop(computerScience);                                                          

        System.out.println(computerScience.getStudents());                                   
    }
}
