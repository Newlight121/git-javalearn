package com.itnewlight.method;

public class MethodOverLoadDemo {
    public static void main(String[] args) {
        test();
        test(10);
    }
    public static void test(){
        System.out.println("=========="+1);
    }
    public static void test(int a){
        System.out.println("=========="+a);
    }
    // 方法重载要求：名称不同或列表不同，即可以区分
    // 用于实现多种解决方案
    public static int test(int a,int b){
        System.out.println("=========="+a);
        return a;
    }
}
