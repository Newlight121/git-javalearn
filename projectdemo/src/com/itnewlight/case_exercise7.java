package com.itnewlight;

import java.lang.reflect.Array;

public class case_exercise7 {
    public static void main(String[] args) {
        printArray(findSu(100,200));
    }
    public static int[] findSu(int min,int max){
        int len = max - min;
        int save_len = 0;
        int[] save = new int[len];
        for (int i = min; i <= max; i++) {
            boolean flag = true;//标志素数

            for (int j = 2; j <= i/2; j++) {
                if((i%j) == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                save[save_len] = i;
                save_len++;
            }
        }
        return save;
    }


    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i]:arr[i]+" ");
        }
        System.out.print("]");
    }
}


