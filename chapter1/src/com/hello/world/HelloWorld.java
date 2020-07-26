package com.hello.world;

public class HelloWorld {
    public static void main(String[] args) {
        JeswinSample jeswin = new JeswinSample("UR15ME196", 23,"jeswin",701028631);
       /* jeswin.setAge(23);
        jeswin.setName("jeswin");
        jeswin.setPhoneNumber(701028631);
        jeswin.setId("12345");
*/
        System.out.println("age : "+jeswin.getAge());
        System.out.println("id : "+jeswin.getId());
        System.out.println("name : "+jeswin.getName());
        System.out.println("ph. no. : "+jeswin.getPhoneNumber());
    }
}
