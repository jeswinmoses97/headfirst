package com.test;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value for a ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter value for b");
        int b = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter operation");
        String opp = scanner2.next();
        {
            float c;

            switch (opp) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opp);
            }
            System.out.println("result = "+c);
        }
    }
}
