package com.opp.thiskeyword;

public class ThisDemo3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("张三", 18);
        Person3 p2 = new Person3("张三", 18);
        System.out.println(p1.compareTo(p2));

    }
}
//定义Person类，里面有name、age属性，并提供compareTo比较方法，用于判断是否和另一个人相等，
// 提供测试类TestPerson用于测试，名字和年龄完全一样，就返回true，否则返回false
class Person3{
    String name;
    int age;
    public Person3(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person3 p){
//        if(this.name.equals(p.name) && this.age == p.age)
//            return true;
//        else
//            return false;
        return this.name.equals(p.name) && this.age == p.age;

    }
}