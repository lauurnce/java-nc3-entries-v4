
package com.joysistvi.activities;

/**
 * Date: August 12, 2025 
 * My first activity at JOYSIS
 */
public class Activity1_Panes {
    static boolean rage; //checking default value of boolean
    public static void main(String[] args) {
        boolean status = true; 
        byte sibling = 4;
        short age = 20;
        int cm = 169;
        int birth = 2005;
        long phone = 9652482080L;
        float height = 1.69f;
        double gpa = 1.33;
        char middleName = 'L';
        String firstName = "Lawrence";
        String lastName = "Panes";
       
        System.out.println("Hello! My name is "+firstName+" "+middleName+". "+lastName);
        System.out.println("I am "+age+"years old with "+sibling+" siblings.");
        System.out.println("My phone number is 0" +phone);
        System.out.println("I am "+height+" meters tall ( "+cm+"cm ).");
        System.out.println("My GPA is " +gpa);
        System.out.println("Student status:" +status);
        System.out.println("I was born in " +birth);
        System.out.println("Are you an irregular student? "+rage);
        
    }
}
