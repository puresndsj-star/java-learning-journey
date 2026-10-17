package com.opp.extends_.extendsdetail;

//输入ctrl + H 可以看到类的继承关系
public class Sub extends Base {
    //子类必须调用父类的构造器，完成父类的初始化。（先有爸爸才能有儿子）
    public Sub(String name, int age) {
        //1. 老师要调用父类的无参构造器, 如下或者 什么都不写,默认就是调用super()
        //super();
        //2. 老师要调用父类的 Base(Stringname) 构造器
        //super("hsp");
        //3. 老师要调用父类的 Base(Stringname, intage) 构造器
        super("king", 10);

        //细节： super 在使用时，必须放在构造器第一行
        //细节: super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        //this() 不能再使用了
        System.out.println("子类Sub(String name, int age)被调用");
    }

    public Sub() {
        //默认调用父类的无参构造器
        //super();
        super("smith",10);
        System.out.println("子类Sub()被调用");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器，如果父类没有提供无
    //参构造器，则必须在子类的构造器中用super去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过
    public Sub(String name) {
        super("tom",30);
        System.out.println("子类Sub(String name)被调用");
    }
    public void sayOk() {//子类方法
        //子类继承了父类所有的属性和方法
        //非私有的属性和方法可以在子类直接访问
        //但是私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();错误
        //要通过父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
