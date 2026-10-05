package com.opp.thiskeyword;

public class ThisDemo1 {
    public static void main(String[] args) {
        Dog1 dog1 = new Dog1("旺财",1);
        System.out.println("dog1的hashcode:"+dog1.hashCode());
        dog1.info();
        System.out.println("===============");
        Dog1 dog2 = new Dog1("大黄",2);
        System.out.println("dog2的hashcode:"+dog2.hashCode());
        dog2.info();
    }
}
class Dog1{
    public String name;
    public int age;
//    public Dog1(String dName,int dAge){//构造器
//        name = dName;
//        age = dAge;
//    }
    //
// 如果我们构造器的形参，能够直接写成属性名，就更好了
// 但是出现了一个问题，根据变量的作用域原则
// 构造器的name 是局部变量，而不是属性
// ===> 引出this关键字来解决
    public Dog1(String name, int age) { //构造器
        // this 表示当前对象，相当于一个隐藏的属性指向当前对象的地址，跟对象名一样也指向当前对象的地址
        // this.name 表示当前对象的属性，name表示参数
        this.name = name;
        // this.age 表示当前对象的属性，age表示参数
        this.age = age;
        System.out.println("this的hashcode:"+this.hashCode());
    }
    public void info(){//成员方法,输出对象属性
        System.out.println("this的hashcode:"+this.hashCode());
        System.out.println("name:"+name+",age:"+age);
    }
}
//this小结：哪个对象调用，this就代表哪个对象