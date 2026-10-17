package com.opp.extends_.extendsdemo;

public class Student {
    //共有属性
    private String name;
    private int age;
    private double score;
    //共有结构器
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    //共有方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getScore() {
        return score;
    }

    public void showInfo() {
        System.out.println("学生信息：姓名" + name + "，年龄" + age + "，分数" + score);
    }
}
