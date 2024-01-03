package com.itnewlight.method;

public class MethodDemo4 {
    public static void main(String[] args) {
        System.out.println(addsum(10));
    }
    public static int addsum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+i;
        }
        return sum;
    }
}
