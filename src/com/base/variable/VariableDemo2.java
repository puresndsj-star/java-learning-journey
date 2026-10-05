package com.base.variable;

public class VariableDemo2 {
    //成员变量（类变量）：从属于类，如果不进行初始化，默认值为0 static
    static int salary;
    //实例变量：从属于对象，如果不进行初始化，默认值为0
    //布尔值默认值为false
    //除了基本类型，其余的默认值都是null
    int num;
    boolean flag;
    String str;
    //main方法：程序的入口
    public static void main(String[] args) {
        //局部变量：从属于方法，必须声明和初始化，才能使用
        int num = 10;
        System.out.println(num);

        //变量类型 变量名字 = new VariableDemo2()
        VariableDemo2 v = new VariableDemo2();
        System.out.println(v.num);
        System.out.println(v.flag);
        System.out.println(v.str);

        //类变量
        System.out.println(salary);

    }
    //其他方法
    public void add() {
        System.out.println("com/method");
    }
}
