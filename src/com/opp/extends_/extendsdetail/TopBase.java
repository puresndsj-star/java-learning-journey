package com.opp.extends_.extendsdetail;
// java中所有类都是Object类的子类,Object是所有类的基类.
//父类构造器的调用不限于直接父类！将一直往上追溯直到Object类(顶级父类)
public class TopBase {//父类是Object
    public TopBase() {
        //super();Object类的无参构造器
        System.out.println("TopBase()被调用");
    }
}
