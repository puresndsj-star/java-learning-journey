package com.method;

public class OverLoadDemo2 {
    public static void main(String[] args) {

//        new Methods().m(5,5);
//        new Methods().m("hello");
//        new Methods().m(5);
        Methods methods = new Methods();
        methods.m(5,5);
        methods.m("hello");
        methods.m(5);
        System.out.println(methods.max(5,6));
        System.out.println(methods.max(5.5,6.5));
        System.out.println(methods.max(5.5,6.5,7));

    }

}
class Methods{
    //第一题：要求编写程序，在Methods类中定义三个重载方法并调用，方法名为m。
    //三个方法分别接收一个int参数、两个int参数、一个字符串参数，分别执行平方运算并输出结果、相乘并输出结果、输出字符串信息。
    //在主类的main方法中分别用参数区别调用三个方法。

    //分析：
    //1 方法名 m
    //2 形参（int）
    //3 void
    public void m(int a){
        System.out.println("平方:"+a*a);
    }
    //分析：
    //1 方法名 m
    //2 形参（int，int）
    //3 void
    public void m(int a,int b){
        System.out.println("相乘:"+a*b);
    }
    //分析：
    //1 方法名 m
    //2 形参（String）
    //3 void
    public void m(String str){
        System.out.println("直接输出:"+str);
    }
    //第二题：在Methods类中定义三个重载方法max()，
    // 第一个方法返回两个int值中的最大值，
    // 第二个方法返回两个double值中的最大值，
    // 第三个方法返回三个double值中的最大值，并分别调用这三个方法。

    //分析：
    //1 方法名 max
    //2 形参（int，int）
    //3 int
    public int max(int a,int b){
        return a>b?a:b;
    }
    //分析：
    //1 方法名 max
    //2 形参（double，double）
    //3 double
    public double max(double a,double b){
        return a>b?a:b;
    //分析：
    //1 方法名 max
    //2 形参（double，double，double）
    //3 double
    }
    public double max(double a,double b,double c){
        double max1 = a>b?a:b;//求出两个数中的最大值
        return max1>c?max1:c;
    }
}
