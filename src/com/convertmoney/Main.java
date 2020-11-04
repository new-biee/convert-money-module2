package com.convertmoney;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter money to be convert(USD): ");
        double money = scanner.nextDouble();
        double rate = 23000;
        double result = money * rate;
        System.out.printf("Result: %.2f VND", result);
    }
}
