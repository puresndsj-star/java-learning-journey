package com.base.scanner;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        //创建一个扫描器，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方式接收：");
        //判断用户有没有输入字符串
        if (scanner.hasNextLine()) {
            //使用nextLine方式接收
            String str = scanner.nextLine();
            System.out.println("输出的内容为：" + str);
        }
        //凡是属于io流的类如果不关闭会一直占用资源，程序无法结束
        scanner.close();
    }
}
/*
    nextLine():
    1.以Enter为结束符，返回的是输入回车之前的所有字符
    2.可以扫描空格,获得空白字符串
*/