package com.opp.modifier;
//java 提供四种访问控制修饰符号，用于控制方法和属性(成员变量)的访问权限（范围）:
//1) 公开级别:用public 修饰,对外公开
//2) 受保护级别:用protected修饰,对子类和同一个包中的类公开
//3) 默认级别:没有修饰符号,向同一个包的类公开.
//4) 私有级别:用private修饰,只有类本身可以访问,不对外公开
public class Demo1 {
    //四个属性，分别使用不同的访问控制修饰符
    //公开级别
    public int n1 = 10;
    //受保护级别
    protected int n2 = 20;
    //默认级别
    int n3 = 30;
    //私有级别
    private int n4 = 40;
    public void m1() {
        //该方法可以访问类中的所有属性
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
    }
    protected void m2() { }
    void m3() { }
    private void m4() { }
    public void hi() {
        //在同一类中，可以访问publicprotected 默认 private 修饰属性和方法
        m1();
        m2();
        m3();
        m4();
    }


}
