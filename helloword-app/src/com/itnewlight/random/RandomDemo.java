package com.itnewlight.random;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i =0;i<20;i++) {
            int number = r.nextInt(10);
            System.out.println(number);
        }

        System.out.println("---------------");
        int number = r.nextInt(14)+3;

        System.out.println("---------------");
        number = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("猜数字1-100：");
        int get_number = 0;
        while(true) {
            try {
                get_number = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.next();
                System.out.println("必须为整数");
//                continue;
            }
        }
        if(get_number==number){
            System.out.println("猜对了");
        }
        else {
            System.out.println("猜错了");
        }


    }
}
