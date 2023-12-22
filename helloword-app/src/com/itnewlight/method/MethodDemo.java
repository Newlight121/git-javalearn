package com.itnewlight.method;

public class MethodDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(sum(a,b));

        int rs = sum(10,50);
        System.out.println(rs);
    }
    public static int sum(int a,int b){
        return a + b;
    }
}
