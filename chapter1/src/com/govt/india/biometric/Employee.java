package com.govt.india.biometric;

public class Employee {
    private int id ;
    private int age;
    private double salary;
    private String name;

    public void employeeInfo(int id, int age, double salary, String name){
        this.id=id;
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    public void printEmployeeInfo(){
        System.out.println("Employee id :"+id);
        System.out.println("Employee age :"+age);
        System.out.println("Employee salary :"+salary);
        System.out.println("Employee name :"+name);
    }
}