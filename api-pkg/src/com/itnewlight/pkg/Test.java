package com.itnewlight.pkg;

import com.itnewlight.pkg.itcast.Demo1;//自动导包（当前目录下）
import com.itnewlight.pkg.itcast.Demo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.print();

        Demo1 demo1 = new Demo1();
        demo1.print();

        Scanner sc =new Scanner(System.in);//Java.lang下的程序不需要导入

        Demo2 demo2 = new Demo2();
        demo2.print();
        //重复包名时必须带path
        com.itnewlight.pkg.itnewlight.Demo2 demo22 = new com.itnewlight.pkg.itnewlight.Demo2();
        demo22.print();

    }

}
