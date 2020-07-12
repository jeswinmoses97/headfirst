package com.corejava.operator;

public class ForLoopDemo {
    public static void main(String[] args) {

        int primeSum = 0;
        for(int i=1 ; i<=50 ; i++){

            if(isPrimeNumber(i)) {
                System.out.println("i is primie "+i);
                primeSum = primeSum+ i;
            }
        }


        System.out.println("Sum of 1 - 50 prime number : "+ primeSum);

    }
    private static boolean isPrimeNumber(int num) {

        boolean isPrimeNumber = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }

        return !isPrimeNumber;
    }
}
