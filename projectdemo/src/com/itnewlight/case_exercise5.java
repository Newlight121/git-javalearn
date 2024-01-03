package com.itnewlight;

public class case_exercise5 {
    public static void main(String[] args) {
        int[] arr = {46,55,65};
        int[] arrcopy = copyIntArray(arr);
        printArray(arrcopy);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i]:arr[i]+" ");
        }
        System.out.print("]");
    }
    public static  int[] copyIntArray(int[] arr){
        int[] arrcopy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrcopy[i] = arr[i];
        }
        return arrcopy;
    }
}
