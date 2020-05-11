package com.test;

import java.util.Scanner;

public class Agetest {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age");
        int age =scanner.nextInt();

        if  (age >= 18)
        {
            System.out.println("You are a Major");
        }
        System.out.println("bye");
    }
}
