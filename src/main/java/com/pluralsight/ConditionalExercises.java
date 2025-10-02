package com.pluralsight;

import java.util.Scanner;

public class ConditionalExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        ask user for their age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult yet.");
        }

//      ask user for grade
        System.out.println("What is your grade in class: (A-F) ");
        char grade = scanner.next().charAt(0);

        if (grade == 'A' || grade == 'a') {
            System.out.println("Excellent!");
        } else if (grade == 'B' || grade == 'b') {
            System.out.println("Good Job!");
        } else if (grade == 'C' || grade == 'c') {
            System.out.println("You passed.");
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Barely passed :0");
        } else {
            System.out.println("Failed womp womp");
        }

//        which one works
        String word1 = "hello";
        String word2 = new String("hello");

        System.out.println("does this work? " + (word1 == word2));
        System.out.println("does this work? " + word1.equals(word2));

//      username and password
        System.out.println("Enter username: ");
        String userName = scanner.next();

//        ask for password
        System.out.println("Enter password: ");
        String passWord = scanner.next();

//        check if they match
//        in java, to check if equal, you need to type out variable.equals(value) instead of variable == value
        if (userName.equals("admin") && passWord.equals("1234")) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Can't get in");
        }
        scanner.close();}
}