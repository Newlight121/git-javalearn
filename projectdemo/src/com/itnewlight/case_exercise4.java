package com.itnewlight;

public class case_exercise4 {
    public static void main(String[] args) {
        System.out.println(numberEncoder(8346));
    }
    public static String numberEncoder(int number){
        int[] numbers = split(number);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i]+5)%10;
        }
        //6438
        reverse(numbers);
        //8346
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data = data + numbers[i];
        }
        return data;
    }

    private static void reverse(int[] arr) {
        for (int i = 0,j = arr.length-1 ;i < j; i++,j--) {
            int temp = arr[i];//对称交换
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    private static int[] split(int number) {
        //number:1983;
        int[] numbers = new int[4];
        numbers[0] = number/1000;
        numbers[1] = (number/100)%10;
        numbers[2] = (number/10)%10;
        numbers[3] = number%10;
        return numbers;
    }
}
