package com.test;

import java.util.Scanner;

public class Ifdemo {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age" );
        int age =scanner.nextInt();

        if (age>=18){
            System.out.println("You are major");
        }
        else {
            System.out.println("bye");
        }
        }
}
