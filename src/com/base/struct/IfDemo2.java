package com.base.struct;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score >= 0 && score <60)
        {
            System.out.println("成绩不及格");
        }else
        {
            System.out.println("成绩及格");
        }

        scanner.close();
    }
}
