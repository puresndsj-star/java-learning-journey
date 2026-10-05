package com.base.datatype;

public class DataTypeDemo4 {
    public static void main(String[] args) {
        //低--高
        //byte, short, char -> int -> long -> float -> double
        int num1 = 128;
        byte b = (byte) num1;//内存溢出，结果为-128
        //强制转换 （类型）变量名 高--低
        //自动转换  低--高
        System.out.println(b);
        System.out.println("------------------------------");
        /*
        注意点：
        1.不能对boolean类型进行强制转换
        2.不能把对象类型转换为不相干的类型
        3.在高容量转换为低容量时，会自动截断小数部分，强制转换
        4.转换的时候可能溢出，或者精度问题
         */
        System.out.println((int)23.7);//23
        System.out.println((int)-23.7f);//-23
        System.out.println("-------------------------------");
        char ch = 'a';
        int ch1=ch+1;
        System.out.println(ch1);//98
        System.out.println((char)ch1);//b
    }
}
