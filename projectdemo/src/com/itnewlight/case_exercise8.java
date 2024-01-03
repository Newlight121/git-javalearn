package com.itnewlight;

public class case_exercise8 {
    public static void main(String[] args) {
        //打印乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println();//换行
        }
    }
}
