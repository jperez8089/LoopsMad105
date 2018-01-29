package com.example.java;
import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int candyChoice;

       do{
           System.out.println("Choose which candy bar you would like");
           System.out.println("_________________________________________");
           System.out.println("1. Skittles");
           System.out.println("2. Hershey");
           System.out.println("3. Twix");
           System.out.println("4. Payday");
           System.out.println("5. Starbursts");
           candyChoice = in.nextInt();
       }while(candyChoice != 1 && candyChoice != 2 && candyChoice != 3 && candyChoice != 4 && candyChoice != 5);
       switch(candyChoice)
       {
           case 1:
               System.out.println("Skittles-----$1.25");
                break;
           case 2:
               System.out.println("Hersheys-----$1.50");
               break;
           case 3:
               System.out.println("Twix------$1.00");
               break;
           case 4:
               System.out.println("Payday----2.00");
               break;
           case 5:
               System.out.println("Starburts---1.00");
               break;
           default:
               System.out.println("have a good one");

       }

    }
}
