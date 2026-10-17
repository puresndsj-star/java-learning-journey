package com.opp.override_.overrideexercise;

public class OverrideExercise {
    public static void main(String[] args) {
        Person p = new Person("张三", 18);
        System.out.println(p.say());
        Student stu = new Student("李四", 20, "001", 90);
        System.out.println(stu.say());
    }
}
