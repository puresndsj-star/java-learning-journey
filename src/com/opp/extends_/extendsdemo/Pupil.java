package com.opp.extends_.extendsdemo;

public class Pupil extends Student {
    public Pupil(String name, int age, double score) {
        super(name, age, score);
    }
    //Pupil特有方法
    public void testing() {
        System.out.println("Pupil"+getName()+"正在考小学数学");
    }
}
