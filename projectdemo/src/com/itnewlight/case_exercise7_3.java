package com.itnewlight;

public class case_exercise7_3 {
    public static void main(String[] args) {
        printArray(findSu(100,200));
    }
    public static int[] findSu(int min,int max){
        int len = max - min;
        int save_len = 0;
        int[] save = new int[len];

        for (int i = min; i <= max; i++) {
            if(check(i)){
                save[save_len] = i;
                save_len++;
            }
        }
        return save;
    }

    public static boolean check(int number){
        for (int i = 2; i <= number/2; i++) {
            if((number%i) == 0){
                return false;
            }
        }
        return true;
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1 ? arr[i]:arr[i]+" ");
        }
        System.out.print("]");
    }
}


