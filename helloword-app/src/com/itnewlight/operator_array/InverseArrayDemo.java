package com.itnewlight.operator_array;

public class InverseArrayDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,50,60,80};
        for (int i =0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
        }

        for (int i:arr) {
            System.out.println(i);
        }
    }
}
