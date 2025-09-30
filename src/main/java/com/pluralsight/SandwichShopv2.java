package com.pluralsight;
import java.util.Scanner;
public class SandwichShopv2 {
    public static void main(String[] args) {
//      scanner
        Scanner myscanner = new Scanner(System.in);

//      size
        System.out.println("What size sandwich do you want, 1(regular) or 2(large): ");
        int size = myscanner.nextInt();

        double price=0;
        if (size == 1) {
            price = 5.45;}
        else if (size == 2) {
            price = 8.95;
        }
        else {
            System.out.println("Invalid choice");
        }
// loaded or not
        System.out.println("do you want your sandwich loaded? true or false");
        boolean isLoaded = myscanner.nextBoolean();

//      determining price
        if(isLoaded){
            if (size == 1) {
                price += 1;}
            else if (size == 2) {
            price +=1.75;
        }}

//      discount
        double discount;

//       age
        System.out.println("Enter your age: ");
        int userAge = myscanner.nextInt();

//      discount based on age
        if (userAge <= 17) { //if 17 or younger 10% off
            discount = (1-0.10);
        } else if (userAge >= 65) {//65 and up get 20% off
            discount = (1-0.20);
        }
        else {
            discount = 1;
        }
//      final cost (
        double totalCost = price * discount;

        System.out.printf("Total cost of sandwich: $%.2f", totalCost);
    }

}
