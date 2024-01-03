package com.itnewlight;

import java.util.Random;

public class case_exercise2 {
    public static void main(String[] args) {
        System.out.println(creatCode(4));
    }
    public static String creatCode(int n){
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    code = code + r.nextInt(10);//连接
                    break;
                case 1:
                    code = code + (char)(r.nextInt(26)+65);//转换为小写char
                    break;
                case 2:
                    code = code + (char)(r.nextInt(26)+97);
                    break;
            }
        }
        return code;
    }
}
