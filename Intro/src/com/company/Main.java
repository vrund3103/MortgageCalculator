package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   final byte monthsInYear = 12;
    final byte percent = 100;
    int principal;
    float annualInterestRate;
    float monthlyInterest;
    byte years;
    int numberOfPayments;
    Scanner scan = new Scanner(System.in);
    while (true) {
        System.out.println("Principal: ");
        principal = scan.nextInt();
        if (principal >= 1000 && principal <= 1_000_000)
            break;
        System.out.println("Enter a valid value between 1000 and 1000000");
    }


      while (true) {
          System.out.println("Annual Interest Rate: ");
          annualInterestRate = scan.nextFloat();
          if (annualInterestRate>=1 && annualInterestRate<=30){
               monthlyInterest = annualInterestRate / percent / monthsInYear;
              break;
          }
          System.out.println("Enter a value between 1 and 30");

      }

      while (true){
    System.out.println("Period: ");
     years = scan.nextByte();
     if (years>=1 && years <=30) {
          numberOfPayments = years * monthsInYear;
         break;
     }
          System.out.println("Enter a value between 1 and 30");
      }

    double mortgage = principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);




      }



  }


