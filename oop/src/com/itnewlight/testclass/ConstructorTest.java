package com.itnewlight.testclass;

public class ConstructorTest {
    public static void main(String[] args) {
        Student s = new Student("aa",54);
        Student s1 = new Student();
        System.out.println(s.name);

        Teacher t = new Teacher();
    }
}
