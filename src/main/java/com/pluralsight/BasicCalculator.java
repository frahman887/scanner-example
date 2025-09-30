package com.pluralsight;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        first number
        System.out.println("First Number: ");
        int firstNumber = scanner.nextInt();

//        second number
        System.out.println("Second Number: ");
        int secondNumber = scanner.nextInt();

//        Menu
        System.out.println("(A)dd\n(S)ubtract\n(D)ivide\n(M)ultiply");
        char opp = scanner.next().charAt(0);

//      Calculation and prints
        int mult = firstNumber * secondNumber;

        System.out.printf("%d * %d = %d  ", firstNumber, secondNumber, mult);
    }
}