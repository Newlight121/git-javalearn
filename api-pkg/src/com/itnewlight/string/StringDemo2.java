package com.itnewlight.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "newlight";
        System.out.println(str);
        System.out.println(str.length());

        char c = str.charAt(1);//提取i位置字符
        System.out.println(c);

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        //转换为字符数组
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //判断字符串是否相等用edquals，字符串变量本身为地址(sout能正常输出是因为string做了优化)
        String str1 = new String("NewLight");
        String str2 = new String("NewLight");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        String str3 = "abc";
        String str4 = "Abc";
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));//忽略大小写

        String str5 = "abcdefg";
        String rs = str5.substring(0, 3);//截取[)
        String rs1 = str5.substring(4);//从开始截取到最后
        System.out.println(rs);
        System.out.println(rs1);

        String str6 = "avadvs";
        String rs3 = str6.replace("av", "**");//替换
        System.out.println(rs3);

        String str7 = "abcdefg";
        System.out.println(str7.contains("Ab"));//判断是否包含子字符串
        System.out.println(str7.contains("cd"));

        String str8 = "张三丰";
        System.out.println(str8.startsWith("张"));//判断字符串是否以某个字符串开头

        String str9 = "a,b,c,d";
        String[] rs4 = str9.split(",");
        for (int i = 0; i < rs4.length; i++) {
            System.out.println(rs4[i]);
        }


    }
}
