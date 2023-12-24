package com.itnewlight.testclass;

public class Student {
    String name;
    double chinese;
    double math;
    public void printTotalScore(){
        System.out.println(name+"总成绩："+(chinese+math));
    }
    public void printAverScore(){
        System.out.println(name+"平均成绩："+(chinese+math)/2);
    }
    public void printThis(){
        System.out.println(this);
    }

    //this作用：解决变量名称冲突
    public void printPass(double chinese){
        if (this.chinese > chinese){
            System.out.println("中文成绩满足");
        }
    }

    //构造器，可重构，作用用于对象初始化，类似于python__init
    public Student(){
        System.out.println("无参数构造器");
    }
    public Student(String name,double chinese){
        System.out.println("有参数构造器");
        this.name = name;
        this.chinese = chinese;
    }
}
