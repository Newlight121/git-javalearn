package com.itnewlight.method;

public class MethodDemo6 {
    public static void main(String[] args) {
        int[] arr = {40,50,60,50};
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i== arr.length-1 ? arr[i] : arr[i]+", ");
        }
        System.out.print("]");
    }
}
