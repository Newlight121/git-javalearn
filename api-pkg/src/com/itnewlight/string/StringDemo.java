package com.itnewlight.string;

public class StringDemo {
    public static void main(String[] args) {
        String name = "NewLight";
        System.out.println(name);

        String str1 = new String();
        System.out.println(str1);//“”初始值

        String str2 = new String("newlight");
        System.out.println(str2);

        char[] chars = {'a','b', 'c'};
        String str3 = new String(chars);
        System.out.println(str3);
    }
}
