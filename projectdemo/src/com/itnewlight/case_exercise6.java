package com.itnewlight;

import java.util.Random;
import java.util.Scanner;

public class case_exercise6 {
    public static void main(String[] args) {
        int[] moneys = {9,66,555,181,481};
//        start(moneys);
        start_random(moneys);
    }
    public static void start(int[] moneys){
        //moneys = [9,66,555,181,481]
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < moneys.length; i++) {
            System.out.println("输入任意按键抽奖：");
            sc.next();
            while(true){
                int temp = r.nextInt(moneys.length);
                if(moneys[temp] != 0){
                    System.out.println("您抽到的红包为"+moneys[temp]);
                    moneys[temp] = 0;
                    break;
                }
            }
        }
        System.out.println("抽奖结束");
    }

    public static void start_random(int[] moneys){//打乱moneys数组，然后直接输出抽奖结果
        //moneys = [9,66,555,181,481]
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < moneys.length; i++) {
            int rd = r.nextInt(moneys.length);//随机化一个index，将i位置与index位置替换
            int temp = moneys[i];
            moneys[i] = moneys[rd];
            moneys[rd] = temp;
        }


        for (int i = 0; i < moneys.length; i++) {
            System.out.println("输入任意按键抽奖：");
            sc.next();
            System.out.println("您抽到的红包为"+moneys[i]);
        }
        System.out.println("抽奖结束");
    }

}
