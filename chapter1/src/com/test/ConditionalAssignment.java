package com.test;

public class ConditionalAssignment {
    float students = 30;
    float rooms = 4;
    float studentsPerRoom = rooms == 0.0f ? 0.0f :students/rooms;
        //System.out.println(studentsPerRoom);

    public static void main(String[] args) {
        ConditionalAssignment assignment = new ConditionalAssignment();
        System.out.println(assignment.studentsPerRoom);
    }

}
