package com.itnewlight.javabean;
//数据和数据操作分离
public class StudentOperator {
    private Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass(double passValue){
        if (student.getScore() >= passValue){
            System.out.println("通过");
        }
        else {
            System.out.println("不通过");
        }
    }
}
