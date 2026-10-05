package com.base.operator;

public class Demo2 {
    public static void main(String[] args) {
        long a = 21321423435L;
        int b=123;
        short c=10;
        byte d=8;

        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
        //按运算类型中最高类型进行运算
    }
}
