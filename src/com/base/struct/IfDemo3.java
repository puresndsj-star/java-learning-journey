package com.base.struct;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = scanner.nextInt();
        if(score == 100)
        {
            System.out.println("满分");
        }else if(score >= 90 && score <100)
        {
            System.out.println("A");
        }else if(score >= 80 && score <90)
        {
            System.out.println("B");
        }else if(score >= 70 && score <80)
        {
            System.out.println("C");
        }else if(score >= 60 && score <70)
        {
            System.out.println("D");
        }else
        {
            System.out.println("成绩不及格");
        }

        scanner.close();
    }
}
/*
    if语句至多有一个else，else语句放在所有if语句之后。
    else if语句可以有多个，else if语句放在if语句和else语句之间。
    一旦其中某个if或else if条件为true，则执行对应语句块，之后的else if和else语句将不再执行。

 */