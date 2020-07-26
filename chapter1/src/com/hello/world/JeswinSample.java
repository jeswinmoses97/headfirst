package com.hello.world;

public class JeswinSample {
    private String id;
    private int age;
    private String name;
    private long phoneNumber;

   // public JeswinSample() {

    //}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public JeswinSample(String id, int age, String name, long phoneNumber) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}