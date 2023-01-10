package com.bridgelabz.day6problems;

import java.util.Scanner;

public class reverseAnumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A number : ");

        int number = scanner.nextInt();
        int temp = number;
        int reverse = 0;

        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;

        }
        System.out.println("Given Number is : " + temp);
        System.out.println("Reverse Of the Number is : " + reverse);
    }
}
