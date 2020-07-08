package com.test;

import java.util.Scanner;

public class Ifelseiftest {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        if (age == 0)
        {
            System.out.println("Invalid age");
        }
        else if (age<18)
        {
            System.out.println("You are a minor");
        }
        else
        {
            System.out.println("You are a major");
        }
        System.out.println("bye");
    }
}