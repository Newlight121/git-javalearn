package com.itnewlight.javabean;

public class Student {
    //1、私有成员变量，并提供get set方法
    private String name;
    private double score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }


}
