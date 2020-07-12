package com.corejava.operator;

public class SumPrimeNum {
    public static void main(String[] args) {
            long i =0;
            long num =0;
            String primeSum="";
            String  primeNumbers = "";

            for (i = 1; i <= 50; i++)
            {
                long counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {

                    primeNumbers = primeNumbers + i + " ";

                }
            }
            System.out.println("Prime numbers from 1 to 50 are :");
            System.out.println(primeNumbers);

        }
    }
