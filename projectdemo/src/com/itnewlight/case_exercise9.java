package com.itnewlight;

import java.util.Random;
import java.util.Scanner;

public class case_exercise9 {
    public static void main(String[] args) {
        int[] select = userSelectNumber();
        printArray(select);
        int[] luck = creatLuckNumbers();
        printArray(luck);
        judegeLuck(select,luck);
    }
    public static int[] userSelectNumber(){
        Scanner sc = new Scanner(System.in);
        int[] sc_select = new int[7];
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.println("选择第" + i + "个红球数：");
                int scr = sc.nextInt();
                if (scr > 33 || scr < 1) {
                    System.out.println("必须选择1-33之间");
                }
                else if (exist(sc_select,scr)){
                    System.out.println("不能重复！");
                }
                else {
                    sc_select[i] = scr;
                    break;
                }
            }
        }

        int scb = 0;
        while (true) {
            System.out.println("选择篮球数：");
            scb = sc.nextInt();
            if (scb > 16 || scb < 1) {
                System.out.println("必须选择1-16之间");
            }
            else{
                sc_select[6] = scb;
                break;
            }
        }

        return sc_select;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i]:arr[i]+" ");
        }
        System.out.print("]");
    }

    private static boolean exist(int[] numbers,int number){
        for (int i = 0; i < numbers.length-1; i++) {
            if(number == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] creatLuckNumbers(){
        Random r = new Random();
        int[] rd_luck = new int[7];
        for (int i = 0; i < 6; i++) {
            int rdr = r.nextInt(33) + 1;
            while (true) {
                if(!exist(rd_luck,rdr)){
                    rd_luck[i]=rdr;
                    break;
                }
            }
        }
        int rdb = r.nextInt(16)+1;
        rd_luck[6]=rdb;
        return rd_luck;
    }

    public static void judegeLuck(int[] select,int[] luck){
        int r_same = 0;
        int b_same = 0;
        for (int i = 0; i < 6; i++) {
            if (select[i] == luck[i]){
                r_same ++;
            }
        }
        if (select[6] == luck[6])
            b_same++;

        int judgeequal = r_same*10+b_same;
        switch (judgeequal){
            case 1:
                System.out.println("六等奖，中0+1，5元");break;
            case 11:
                System.out.println("六等奖，中1+1，5元");break;
            case 21:
                System.out.println("五等奖，中2+1，10元");break;
            case 31:
                System.out.println("五等奖，中3+1，10元");break;
            case 40:
                System.out.println("五等奖，中4+0，10元");break;
            case 41:
                System.out.println("四等奖，中4+1，200元");break;
            case 50:
                System.out.println("四等奖，中5+0，200元");break;
            case 51:
                System.out.println("三等奖，中5+1，3000元");break;
            case 60:
                System.out.println("二等奖，中6+0，500w元");break;
            case 61:
                System.out.println("一等奖，中6+1，1000w元");break;
        }

    }
}
