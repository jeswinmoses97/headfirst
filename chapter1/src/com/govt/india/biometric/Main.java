package com.govt.india.biometric;

import com.govt.india.biometric.Employee;

public class Main {
    public static void main (String[]args){
        Employee employeejes = new Employee();

        System.out.println("Before Vslue Set");

        employeejes.printEmployeeInfo();

        employeejes.employeeInfo(1,21,3000,"jeswin");

        System.out.println("After Vslue Set");

        employeejes.printEmployeeInfo();
    }
}
