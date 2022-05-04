package com.company;

import java.util.Scanner;
// Program will ask the user for two numbers to be added and output the solution
public class Main {

    public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
    // Asks user to enter two numbers
    System.out.println("We will do a simple addition problem.");

    // Number 1
    System.out.println("Please enter number.");
    int num1 = num.nextInt();
    System.out.println("First number: " + num1);

    // Number 2
    System.out.println("Enter a second number.");
    int num2 = num.nextInt();
    System.out.println("Second number: " + num2);
    System.out.println();

    // Both numbers will be added and output the sum
    int sum = num1 + num2;
    System.out.println("The sum of both the numbers are: " + sum);
    }
}
