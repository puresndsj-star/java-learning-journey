package com.base.operator;

public class Demo6 {
    public static void main(String[] args) {
       /*
       A=0011 1100
       B=0000 1101

       A&B=0000 1100//遇0为0
       A|B=0011 1101//遇1为1
       A^B=0011 0001//相同为0，不同为1
       ~A=1100 0011//取反

       2*8=16 2*2*2*2
       << *2
       >> /2
       0000 0000    0
       0000 0001    1
       0000 0010    2
       0000 0011    3
       0000 0100    4
       0000 1000    8
       0001 0000    16

        */
        System.out.println(2<<3); // 16 2*2^3 内存向左移动3位
    }
}
