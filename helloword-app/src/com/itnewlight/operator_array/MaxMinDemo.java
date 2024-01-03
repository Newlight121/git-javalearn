package com.itnewlight.operator_array;

public class MaxMinDemo {
    public static void main(String[] args) {
        int[] arr = {54,45,22,56};
        int max = arr[0];
        for (int i:arr){
            if (i>max)
                max = i;
        }
        System.out.println(max);
    }
}
