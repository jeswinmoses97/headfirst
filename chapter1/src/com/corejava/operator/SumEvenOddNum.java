package com.corejava.operator;

public class SumEvenOddNum {
    public static void main(String[] args) {
        int i,j=0,k,l=0;
        for (i=0 ; i<=20; i++)
            if (i%2!=0)
            {
            System.out.println(i);
            j=j+i;
        }
        System.out.println("sum of odd number="+j);

        for (k=0 ; k<=20; k++)
            if (k%2==0)
            {
                System.out.println(k);
                l =l+k;
            }
        System.out.println("sum of even number="+l);
    }
}
