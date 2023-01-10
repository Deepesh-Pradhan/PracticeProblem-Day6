package com.bridgelabz.day6problems;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= number / 2) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == number)
            System.out.println(sum + " is Perfect Number");
        else System.out.println(sum + " is not Perfect Number");
    }
}