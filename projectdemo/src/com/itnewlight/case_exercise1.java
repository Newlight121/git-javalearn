package com.itnewlight;

public class case_exercise1 {
    public static void main(String[] args) {
        double price = calculate(10,200,"头等舱");
        System.out.println(price);
    }
    public static double calculate(int month, double price, String type){
        if(month>=5 && month <=11){
            switch (type){
                case "头等舱":
                    price = price*0.95;
                    break;
                case "经济仓":
                    price = price*0.8;
                    break;
            }
        }
        else {
            switch (type){
                case "头等舱":
                    price = price*0.7;
                    break;
                case "经济仓":
                    price = price*0.65;
                    break;
            }
        }
    return price;
    }
}
