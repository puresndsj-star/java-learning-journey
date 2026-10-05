package com.base.datatype;

public class DataTypeDemo5 {
    public static void main(String[] args) {
        //大数字，注意溢出问题
        int money = 10_0000_0000;//下划线分割
        int years = 20;
        int total = money * years;//计算溢出
        long total2 = money * years;//默认是int，转换之前已经存在问题
        long total3 = (long) money * years;
        long total4 = money * (long)years;//先把一个数转化为long
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);

    }
}
