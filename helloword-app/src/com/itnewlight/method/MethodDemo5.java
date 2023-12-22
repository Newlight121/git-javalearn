package com.itnewlight.method;

public class MethodDemo5 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);

        int[] arr = {40,60,50};
        changearr(arr);
        System.out.println(arr[0]);
    }

    public static void change(int a) {
        System.out.println(a);
        a = 30;
        System.out.println(a);
    }
    public static void changearr(int[] arr){
        System.out.println(arr[0]);
        arr[0] = 30;
        System.out.println(arr[0]);
    }
}
