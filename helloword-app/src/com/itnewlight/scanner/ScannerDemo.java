package com.itnewlight.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("等待输入年龄：");
        int i = sc.nextInt();
        System.out.println(i);
        System.out.println("等待输入名字：");
        String name = sc.next();
        System.out.println(name);


    }
}
