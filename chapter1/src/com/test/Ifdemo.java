package com.test;

import java.util.Scanner;

public class Ifdemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value for a ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter value for b");
        int b = scanner1.nextInt();

        int add = a+b;
        System.out.println("Add =" +add);

        int sub = a-b;
        System.out.println("Sub =" +sub);

        int mul = a*b;
        System.out.println("Mul =" +mul);

        int div = a/b;
        System.out.println("Div =" +div);

    }
}
