package com.itnewlight;
/*
   *
  * *
 * * *
* * * *
*
* 行(i) 空格(n-i)  星星(2i-1)  换行
* 1       3          1
* 2       2          3
* 3       1          5
* 4       0          7
 */
public class case_exercise8_2 {
    public static void main(String[] args) {
        //打印乘法表
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(j%2!=0)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
