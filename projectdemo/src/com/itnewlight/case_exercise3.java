package com.itnewlight;

import java.util.Scanner;

public class case_exercise3 {
    public static void main(String[] args) {
        System.out.println("最终的平均分:"+averageScore(5));
    }
    public static double averageScore(int n){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("输入第"+(i+1)+"个评委分数：");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        for (int i = 0; i < n; i++) {
            sum = sum+scores[i];
            if(scores[i]>max)
                max = scores[i];
            if(scores[i]<min)
                min = scores[i];
        }
        double aver = 1.0*(sum - max - min)/(n-2);
        return aver;
    }
}
