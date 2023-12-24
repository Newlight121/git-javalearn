package com.itnewlight.testclass;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "小明";
        s1.chinese = 100;
        s1.math = 50;
        s1.printTotalScore();
        s1.printAverScore();
        Student s2 = new Student();
        s2.name = "波仔";
        s2.chinese = 60;
        s2.math = 100;
        s2.printTotalScore();
        s2.printAverScore();
        System.out.println(s1);
        System.out.println(s2);
//        System.out.println(s1);
    }
}
