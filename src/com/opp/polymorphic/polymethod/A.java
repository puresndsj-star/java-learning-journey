package com.opp.polymorphic.polymethod;

public class A extends B{
    public int sum(int n1,int n2){//和下面sum构成重载
        return n1+n2;
    }
    public int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public void say(){
        System.out.println("A say()被调用");
    }
}
