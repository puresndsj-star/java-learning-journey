package com.opp.varscope;

public class VarScopeDemo2 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.say();//当执行say方法时，say方法的局部变量比如name，会创建，当say执行完毕后，name局部变量就销毁，但属性（全局变量）仍然可以使用
        T t1=new T();
        t1.test();//第一种跨类访问属性
        t1.test2(p1);//第二种跨类访问属性
    }
}
//属性和局部变量可以重名，访问时遵循就近原则
//在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。
//属性生命周期较长，伴随着对象的创建而创建，伴随着对象的死亡而死亡。局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而死亡。
class Person{
    String name="张三";
    //属性可以加访问修饰符，比如public，private protected
    //局部变量不能加修饰符
    private int age; // 私有属性，只能在本类中访问
    public int getAge() {
        return age;
    }

    public void say(){
        //细节 属性和局部变量可以重名，访问时遵循就近原则
        String name="李四";
        System.out.println("姓名："+name);//李四
    }
    public void hi(){
        String address="北京";
        //String address="上海";//错误，重复定义变量
        String name="王五";//可以
    }

}
class T{
    //全局变量/属性可以被本类使用。或其它类使用 （通过对象调用）
    public void test(){
        com.opp.varscope.Person p1=new com.opp.varscope.Person();
        System.out.println(p1.name);//张三
    }
    public void test2(com.opp.varscope.Person p){
        System.out.println(p.name);//张三
    }
}

