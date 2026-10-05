package com.base.scanner;

import java.util.Scanner;

public class demo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        float f;
        System.out.println("请输入一个整数：");
        if(scanner.hasNextInt())
        {
            i = scanner.nextInt();
            System.out.println("输入的整数为：" + i);
        }else {
            System.out.println("输入的不是整数！");
        }
        System.out.println("请输入一个浮点数：");
        if(scanner.hasNextFloat())
        {
            f = scanner.nextFloat();
            System.out.println("输入的浮点数为：" + f);
        }else {
            System.out.println("输入的不是浮点数！");
        }
        scanner.close();
    }
}
/*
    1. nextInt()：接收用户输入的整数
    2. nextFloat()：接收用户输入的浮点数
    3. nextDouble()：接收用户输入的双精度浮点数
    4. nextBoolean()：接收用户输入的布尔值
    5. nextLine()：接收用户输入的字符串
    6. next()：接收用户输入的字符串
    7. hasNext()：判断用户输入是否有效
    8. hasNextInt()：判断用户输入是否为整数
    9. hasNextFloat()：判断用户输入是否为浮点数
 */