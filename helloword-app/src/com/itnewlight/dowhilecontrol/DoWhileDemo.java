package com.itnewlight.dowhilecontrol;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i =5;
        do{//dowhile优先执行
            System.out.println(i);
            i++;
        }while (i*i<20);
    }
}
