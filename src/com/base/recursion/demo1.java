package com.base.recursion;

public class demo1 {
    public static void main(String[] args) {
        T t1 = new T();
        t1.test(4);//n=2 n=3 n=4
        int res=t1.factorial(5);
        System.out.println("res="+res);

    }
}
class T{
    public void test(int n) {
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    //阶乘factorial  n! = n*(n-1)!   n! = n*(n-1)*(n-2)*...*1
    //n=5 5*4! ;n=4 4!=4*3! n=3 3!=3*2! ;n=2 2!=2*1!; n=1 1!=1,不断往下调用自己本身，再逐层返回
    public int factorial(int n) {
        if (n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
/*
递归：方法调用方法，必须有结束条件，否则会无限调用，导致栈溢出
    每一个栈都会完整的去执行递归方法，直到满足结束条件，才会开始返回
    递归方法的执行顺序：
        1.方法调用方法
        2.方法执行
        3.方法返回

    重要规则：
    1.执行一个方法时，就创建一个新的受保护的独立空间（栈空间）。
    2.方法的局部变量是独立的，不会相互影响，比如n变量。
    3.如果方法中使用的是引用类型变量（比如数组），就会共享该引用类型的数据。
    4.递归必须向退出递归的条件逼近，否则就是无限递归，出现StackOverflowError，死龟了:) 。
    5.当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕或者返回时，该方法也就执行完毕。
 */