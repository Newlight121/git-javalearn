package com.itnewlight.flowcontrol;

public class FlowControlDemo {
    public static void main(String[] args) {
        int a = 10;
        if(a > 5){
            System.out.println("a>5");
        }
        else if (a>3) {
            System.out.println("3<a<5");
        }
        else {
            System.out.println("a<3");
        }
//        long b = (long) 15.2;
        switch (a){//不支持double、float、long，因为浮点数在电脑里是无穷位的
            case 5:
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
        }


    }
}
