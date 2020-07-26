package com.apple;

public class IphoneMacBook {
    public static void main(String[] args) {
        AppleJeswin iphone = new AppleJeswin("iphone 8", 3,64);
        AppleJeswin macbook = new AppleJeswin("macbook pro", 16,512);
        System.out.println("Model : "+iphone.getModel());
        System.out.println("Ram : "+iphone.getRam());
        System.out.println("Rom : "+iphone.getRom());

        System.out.println("Model : "+macbook.getModel());
        System.out.println("Ram : "+macbook.getRam());
        System.out.println("Rom : "+macbook.getRom());

    }
}
