package com.method;

import java.util.Scanner;

public class OverLoadDemo1 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1, 2.1));
        System.out.println(mc.calculate(1.1, 2));
        System.out.println(mc.calculate(1, 2, 3));
    }
}

class MyCalculator {
    //下面四个方法构成了重载
    //两个整数和
    public int calculate(int a, int b) {
        System.out.println("calculate(int a, int b)被调用");
        return a + b;
    }
    //一个整数和一个双精度数和
    public double calculate(int a, double b) {
        System.out.println("calculate(int a, double b)被调用");
        return a+b;//自动类型提升
    }
    //一个双精度数和一个整数和
    public double calculate(double a, int b) {
        System.out.println("calculate(double a, int b)被调用");
        return a+b;
    }
    //三个整数和
    public int calculate(int a, int b, int c) {
        System.out.println("calculate(int a, int b, int c)被调用");
        return a+b+c;
    }
}
//重载好处：方法名相同，功能不同，提高代码的可读性和可维护性，减轻起名和记名的麻烦
/*注意事项：
    1.方法名：必须相同 - 强调方法重载要求方法名称一致。
    2.参数列表：必须不同（参数类型或个数或顺序，至少有一样不同，参数名无要求） - 详细说明了参数列表在方法重载中的变化要求，包括参数类型、个数或顺序的差异，同时指出参数名称没有特定要求。
    3.返回类型：无要求 - 指出方法重载对返回类型没有限制。
    4.方法重复定义：只形参名不一样或返回类型不一样
*/
