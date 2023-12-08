package com.itnewlight.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//int/int最终结果也是int
        System.out.println((double) a/b);

        System.out.println("-------------------------");
        System.out.println("abc"+5);
        System.out.println("a"+5);
        System.out.println('a'+5);
        System.out.println('a'+5+"sadd");//单引号优先计算，双引号直接连接

        System.out.println("-------------------------");
        double size =9.8;
        int storage = 16;
        boolean rs1 = size >=6.95 & storage>=8;//&&双与更快
        System.out.println(rs1);
        boolean rs2 = size >=6.95 | storage>=8;//||双或更快

        System.out.println(a>100 & ++b>100);//&必定会运行两句，&&判断第一条满足后直接break
        System.out.println(b);

        System.out.println(rs2);

        System.out.println(!rs1);

        System.out.println(true ^ false);
        System.out.println(false ^ false);
        System.out.println(true ^ true);


        System.out.println("-------------------------");
        double score = 65;
        String rs =  score>=60 ? "及格" :"不及格";
        System.out.println(rs);

        int i=10, j=12, k=41;
        System.out.println(10 > 3 || 10 > 3 && 10 < 3);
        System.out.println((10 > 3 || 10 > 3) && 10 < 3);//&&优先级大于||

    }
}
