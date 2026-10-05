package com.base.datatype;

public class DataTypeDemo2 {
    public static void main(String[] args) {
        //整数拓展：二进制0b  八进制0  十六进制0x
        int num1 = 10;
        int num2 = 0b1010; // 二进制
        int num3 = 012; // 八进制
        int num4 = 0xA; // 十六进制
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);
        System.out.println("-------------------------------");

        //============================================
        //浮点数拓展：银行业务,钱
        //BigDecimal 数学工具类，精确表示和计算
        //============================================
        java.math.BigDecimal money = new java.math.BigDecimal("0.1");
        System.out.println(money);//0.1
        //float 有限 离散 含误差 大约 接近但不等于
        //double
        //最好完全避免使用浮点数进行比较
        float money1 = 0.1f;//0.1
        double money2 = 1.0 / 10;//0.1
        System.out.println(money1 == money2);//false
        System.out.println(money1);//0.1
        System.out.println(money2);//0.1

        float money3 = 2334328409328f;
        float money4 = money3 + 1;
        System.out.println(money3 == money4);//true
        System.out.println("-------------------------------");

        //字符拓展
        char ch1 = 'a';
        char ch2 = '中';
        System.out.println(ch1);
        System.out.println((int) ch1);//强制转换，97
        System.out.println(ch2);
        System.out.println((int) ch2);//强制转换，20013
        //所有字符本质是数字
        // Unicode 编码 2字节 65536  2^16=65536
        //U0000-UFFFF
        char ch3 = '\u0061';
        System.out.println(ch3);//a
        System.out.println("-------------------------------");

        //转义字符
        // \t 制表符
        // \n 换行
        // \r 回车
        // \\ 反斜杠
        // \" 双引号
        // \' 单引号
        // \b 退格
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\rWorld");
        System.out.println("Hello\\World");
        System.out.println("Hello\"World");
        System.out.println("Hello\'World");
        System.out.println("Hello\bWorld");
        System.out.println("-------------------------------");

        //布尔值拓展
        boolean flag = true;
        if (flag == true){}//新手
        if (flag){}//老手
    }
}