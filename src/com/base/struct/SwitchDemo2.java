package com.base.struct;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //表达式结果必须是int,char,String类型，不能是boolean类型
        //字符的本质还是数字
        //反编译查看源码 java---class字节码文件----反编译（IDEA）
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.next();
        switch (name){
            case "吉伊":
                System.out.println("chiikwa");
                break;
            case "乌萨奇":
                System.out.println("usagi");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
