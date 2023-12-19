package com.itnewlight.operator_array;

import javax.sound.midi.SoundbankResource;
import java.util.Random;
import java.util.Scanner;

public class RandomSortArray {
    public static void main(String[] args) {
        int[] values = {20,50,10,60,50};
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < values.length; i++) {
            int index = r.nextInt(values.length);//每一个i随机一个index
            int tmp = values[index];//交换index位置与i位置
            values[index]= values[i];
            values[i]=tmp;

        }
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }
    }
}
