package com.base.struct;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");
        String input = scanner.nextLine();
        if(input.equals("hello"))
        {
            System.out.println(input);
        }
        System.out.println("end");
        scanner.close();
    }
}
