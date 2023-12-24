package com.itnewlight.encapsulation;
// 封装
public class EncapsulationClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("aa");//使用方法进行暴露
        Student s1 = new Student("aa",50);//使用构造函数进行暴露
    }
}
