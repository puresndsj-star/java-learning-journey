package com.method;

public class VarParameterDemo2 {
    public static void main(String[] args) {
        T t1 = new T();
        int[] arr = {1, 2, 3, 4, 5};
        t1.f1(arr);

    }
}
//可变参数的实参可以为0个或任意多个。
//可变参数的实参可以为数组。
//可变参数的本质就是数组。
//可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后。
//一个形参列表中只能出现一个可变参数。
class T{
    public void f1(int... nums){
        System.out.println("长度："+nums.length);
    }
    //细节：可变参数可以和普通类型参数一起使用放在形参列表，但可变参数必须放在最后
    public void f2(String str, double... nums){
    }
    //一个形参列表中只能有一个可变参数
    //下面的写法是错的
    //public void f3(int... nums1,double... nums2){
    //}
}