package com.itnewlight.typec;

public class TypeConversuionDemo {
    public static void main(String[] args) {
        byte a = 12;
        int b = a;
        long c = 30;
        System.out.println(a);
        System.out.println(b);
        double rs = a+b+c;

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1+b2;//byte,short,char转换为int运算

        int c1 = 6666;//0001 1010 0000 1010
        byte c2 = (byte) c1;//强制转换保留0000 1010
        System.out.println(c2);
        double c3 = 45.5;
        int c4 = (int) c3;//保留整数部分
        System.out.println(c4);
    }
}
