package com.itnewlight.acsii;

public class ASCIIDemo {
    public static void main(String[] args) {
        System.out.println('a'+10);//97+10=107
        System.out.println('A'+10);//65+10=75

        int a1 = 0B01100001;
        System.out.println(a1);
        int a2 = 0141;// 0开头8进制
        System.out.println(a2);
        int a3 = 0xFA;// 0开头8进制
        System.out.println(a3);
    }
}
