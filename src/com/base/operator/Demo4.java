package com.base.operator;

public class Demo4 {
    public static void main(String[] args) {
        //++ -- 自增，自减 一元运算符
        int a = 3;
        int b = a++;//执行顺序：先赋值给b，后自增
        //a=a+1;
        System.out.println(a);//4
        //a=a+1;
        int c = ++a;//执行顺序：先自增，后赋值给c
        System.out.println(a);//5
        System.out.println(b);//3
        System.out.println(c);//5

        //幂运算 2^3 2*2*2 8 很多运算会使用一些工具来操作
        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}
