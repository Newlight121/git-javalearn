package com.itnewlight.testclass;

public class Test2 {
    public static void main(String[] args) {

        //class有初始值
        //public类名必须为文件名
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.chinese);
        System.out.println(s.math);

        s = null;//java自动回收堆内存的无用对象

    }
}
