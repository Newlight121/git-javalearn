package com.itnewlight.testclass;

public class ClassThisTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        s1.printThis();//this指向对象的地址
        Student s2 = new Student();
        System.out.println(s2);
        s2.printThis();

        s1.chinese = 60;
        s1.printPass(50);


    }
}
