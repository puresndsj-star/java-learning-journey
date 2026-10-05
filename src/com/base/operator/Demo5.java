package com.base.operator;

public class Demo5 {
    public static void main(String[] args) {
        //与and 或or 非取反
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b:"+(a && b));
        System.out.println("a||b:"+(a || b));
        System.out.println("!(a&&b):"+!(a && b));

        //短路运算
        int c =5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println("c:"+c);
    }
}
