package com.itnewlight.whilecontrol;

public class WhileDemo {
    public static void main(String[] args) {
        int i =0;
        while (i*i<20){
            System.out.println(i);
            i++;
        }
        i =0;
        for(;i*i<20;){
            System.out.println(i);
            i++;
        }
    }
}
