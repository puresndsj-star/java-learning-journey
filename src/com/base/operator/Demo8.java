package com.base.operator;

public class Demo8 {
    public static void main(String[] args) {
        //三目运算符 x？y：z
        //如果x为true，则返回y，否则返回z
        int score =50;
        String type = score>=60?"及格":"不及格";//必须掌握
        //if
        System.out.println(type);
    }
}
