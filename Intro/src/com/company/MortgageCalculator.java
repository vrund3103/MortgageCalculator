package com.company;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MortgageCalculator {
  public static void main(String[] args) {
    final byte monthsInYear = 12;
    final byte percent = 100;
    Scanner scan = new Scanner(System.in);
    System.out.println("Principal: ");
    int principal = scan.nextInt();

    System.out.println("Annual Interest Rate: ");
    float annualInterestRate = scan.nextFloat();
    float monthlyInterest = annualInterestRate / percent / monthsInYear;

    System.out.println("Period: ");
    byte years = scan.nextByte();
    int numberOfPayments = years * monthsInYear;

    double mortgage = principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);


  }
}