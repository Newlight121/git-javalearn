package com.itnewlight.encapsulation;

import java.io.FilenameFilter;
import java.lang.constant.DynamicCallSiteDesc;

public class Student {
    public void setName(String name) {
        this.name = name;
    }

    public void setMath(double math) {
        this.math = math;
    }

    private String name;
    private double math;
    public Student(){}
    public Student(String name,double math){
        this.name = name;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public double getMath() {
        return math;
    }
    private void printName(){
        System.out.println(name);
    }
    public void printMath(){
        System.out.println(name+"数学成绩："+math);
    }
}
