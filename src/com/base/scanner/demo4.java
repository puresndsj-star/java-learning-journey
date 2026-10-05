package com.base.scanner;

import java.util.Scanner;

public class demo4 {
    //输入多个数字，并求其总和与平均值
    public static void main(String[] args) {
        //输入多个数字，并求其总和与平均值，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("请输入多个数字：");
        while (scanner.hasNextDouble()) {
            double number = scanner.nextDouble();
            sum += number;
            count++;
        }

        System.out.println(count+"个输入的数字总和为：" + sum);
        System.out.println(count+"个输入的数字平均值为：" + (sum / count));
        scanner.close();
    }
}
