package com.itnewlight.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String name = "newlight";//string对象是不可变的
        name += "21";//这个操作实际上产生了新的对象，name的指向地址变化了
        System.out.println(name);

        //"..."给出的对象存在常量池中，不会重复(为了节约内存)，new创建的为新的对象
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        String s3 = new String("cde");//New直接创建两个对象，一个放在常量池，一个在堆内存?指向堆内存
        String s4 = new String("cde");//又创建一个对象指向堆内存
        String s5 = "cde";//指向常量池
        System.out.println(s3 == s4);//flase
        System.out.println(s3 == s5);//false




    }
}
