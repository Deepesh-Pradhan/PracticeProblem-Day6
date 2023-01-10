package com.bridgelabz.day6problems;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}
