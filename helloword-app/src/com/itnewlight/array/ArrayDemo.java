package com.itnewlight.array;

import javax.sound.midi.SoundbankResource;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] ages = new int[]{46,55,65};
        double[] scores = {46.5,56.52,23.2};

        int ages1[] = {46,55,65};

        System.out.println(ages[0]); //取值
        System.out.println(ages); //地址
        System.out.println(ages.length); //长度
        System.out.println("--------------------------------");
        //修改
        ages[2] = 64;
        System.out.println(ages[2]);
        System.out.println("--------------------------------");
        //遍历
        for(int i =0; i<ages1.length; i++){
            System.out.println(ages1[i]);
        }

        for (int i : ages1) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        //动态init
        int[] ages4 = new int[4];
        for (int i : ages4) {
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        for(int i =0; i<ages1.length; i++){
            ages1[i] =i;
        }
        System.out.println("--------------------------------");
        int[] arr = ages1;
        System.out.println(arr);
        System.out.println(ages1);
        System.out.println(arr[1]);
        System.out.println(ages1[1]);

        arr = null;
//        System.out.println(arr[0]);


    }
}
