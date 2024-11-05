package com.sf.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("100")
    private int marks;

    @Value("1")
    private int rollNo;

    @Value("Student 1")
    private String name;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println(this.rollNo);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}
