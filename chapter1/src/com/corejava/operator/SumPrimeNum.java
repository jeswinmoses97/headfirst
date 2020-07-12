package com.corejava.operator;

public class SumPrimeNum {
    public static void main(String[] args) {
            int i =0;
            int num =0;
            String  primeNumbers = "";
            int sumPrime =0;

            for (i = 1; i <= 50; i++)
            {
                long j=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        j = j + 1;
                    }
                }
                if (j ==2)
                {
                    primeNumbers = primeNumbers + i+" " ;
                    sumPrime=sumPrime+i;
                }
            }
            System.out.println("Prime numbers from 1 to 50 are :");
            System.out.println(primeNumbers);
        System.out.println("sum of prime numbers from 1 to 50 : "+sumPrime);

        }
    }
