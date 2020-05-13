package com.test;

import java.util.Scanner;

public class Ifelsetest {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        if (age>=18)
        {
            System.out.println("you are a major");
        }
        else
        {
            System.out.println("you are a minor");
        }
        System.out.println("Bye");
    }
}
