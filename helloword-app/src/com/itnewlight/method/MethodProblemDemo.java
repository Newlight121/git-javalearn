package com.itnewlight.method;

public class MethodProblemDemo {
    public static void main(String[] args) {
        printHelloWorld();
        sum(60,40);//不print
        System.out.println(sum(40,60));
        int rs = sum(40,60);
        System.out.println(rs);
    }

    public static int sum(int a,int b){
        return a + b;
    }
    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("123");
        }
    }
}
