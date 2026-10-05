package com.base.operator;

public class Demo3 {
    public static void main(String[] args) {
        //关系运算符返回的结果是boolean类型：true false
        //if
        int a = 10;
        int b = 20;
        int c = 21;
        //取余，模运算
        System.out.println(c % a); // 1

        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }
}
