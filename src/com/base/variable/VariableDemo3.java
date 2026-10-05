package com.base.variable;

public class VariableDemo3 {
    //修饰符 public 表示公共的，可以被其他类访问
    //修饰符 static 表示静态的，属于类，不属于对象
    //修饰符 void 表示没有返回值
    //不存在先后顺序
    static final double PI = 3.14;
    //final static double PI = 3.14;
    public static void main(String[] args) {
        System.out.println(PI);

        //类成员变量：首字母小写和驼峰原则 monthSalary
        //局部变量：首字母小写和驼峰原则
        //常量：大写字母和下划线 MAX_VALUE
        //类名：首字母大写和驼峰原则 Man，GoodMan
        //方法：首字母小写和驼峰原则 run（），runRUN（）
    }
}
