package com.pluralsight;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Step 1: Ask for the user’s name
        Instructions:

        Prompt the user to enter their name.
                Use nextLine to read it.
        Print a simple greeting with their name.

         */
    Scanner myscanner = new Scanner(System.in);
    System.out.print("Enter your name:");
    String userName = myscanner.nextLine();
    System.out.printf("hello %s", userName);

    /*Step 2: Ask for the user’s age
Instructions:

Keep the name part from Step 1.
Add code to prompt for the user’s age using nextInt.
Print both their name and age.

     */
        System.out.print("\nwhat is your age?: ");
        int age = myscanner.nextInt();
        System.out.printf("\n%s is %d years old.", userName, age);
/*Step 3: Ask for the user’s height in meters
Instructions:

Keep the code from Step 2.
Add code to ask for their height in meters using nextDouble.
Print their name, age, and height. */
        System.out.println("\nPlease enter your height in meters: ");
        double userHeight = myscanner.nextDouble();
        System.out.printf("\n%s is %d years old and %.2f meters tall", userName, age, userHeight);
/*
Likes java?
 */
        System.out.println("\nDo you like Java? Enter true or false");
        boolean userLikesJava = myscanner.nextBoolean();

        System.out.printf("Summary:\nName: %s\nAge: %d\nHeight(m): %f\nLikes Java: %b", userName, age, userHeight, userLikesJava);
    }
}