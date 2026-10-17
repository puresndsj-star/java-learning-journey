package com.opp.override_.overrideexercise;

public class Student extends Person{
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"; id:"+id+"; score:"+score;
    }
}
