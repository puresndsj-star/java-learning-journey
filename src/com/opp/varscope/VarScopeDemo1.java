package com.opp.varscope;

public class VarScopeDemo1 {
    public static void main(String[] args) {

    }

}
class Cat{
    //全局变量：也就是属性，作用域为整个类体 Cat类：cry eat等方法使用属性
    //属性在定义时可以不赋值，使用时会赋默认值
    int age=10;
    double weight;//默认值是0.0
    {
        int num=100;
    }//这个不是属性
    public void hi(){
        //局部变量必须赋值之后才能使用，因为没有默认值
        int n=1;
        String name="tom";
        System.out.println("n="+n);
        System.out.println("weight="+weight);
    }
    public void cry(){
        //1.局部变量一般是指在成员方法中定义的变量
        //2.n和 name就是局部变量
        //3.局部变量必须声明和初始化，才能使用
        //4.n和name的作用域在cry方法中
        int n = 10;
        String name = "tom";
        System.out.println("在cry方法中使用属性，age="+age);
    }
    public void eat(){
        System.out.println("在eat方法中使用属性，age="+age);
        //System.out.println("在eat方法中使用cry的变量，name="+name);//错误
        //System.out.println("num"+num);//错误
    }
}
