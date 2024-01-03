package com.itnewlight.javabean;
//实体类
public class Test {
    public static void main(String[] args) {
        //数据
        Student s1 = new Student("aa",55);
        System.out.println(s1.getName());

        //操作
        StudentOperator so = new StudentOperator(s1);
        so.printPass(50);
    }
}
