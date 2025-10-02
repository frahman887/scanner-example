package com.pluralsight;
import java.util.Scanner;
public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();

//      hours worked
        System.out.print("How many hours have you worked this week? ");
        double hoursWorked = scanner.nextDouble();

//        pay rate
        System.out.print("How much do you get paid hourly? ");
        double payRate = scanner.nextDouble();

//        display employee's name and their gross pay at the end
        double weekPay = payCalc(hoursWorked, payRate);
        System.out.format("%s will get paid $%.2f", userName, weekPay);
    }
    //    calculate their pay for the week
    public static double payCalc(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }
}