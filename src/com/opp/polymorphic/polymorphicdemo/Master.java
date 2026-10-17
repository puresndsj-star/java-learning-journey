package com.opp.polymorphic.polymorphicdemo;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //通过方法重载给不同动物喂食不同食物
//    //主人给 小狗喂 骨头
//    public void feed(Dog dog, Bone bone) {
//        System.out.println("主人 " + name + " 给 " + dog.getName() + " 吃 " + bone.getName());
//    }
//    //主人给 小猫喂 黄花鱼
//    public void feed(Cat cat, Fish fish) {
//        System.out.println("主人 " + name + " 给 " + cat.getName() + " 吃 " + fish.getName());
//    }

    //如果动物很多，食物很多
    //===> feed 方法很多，不利于管理和维护
    //Pig--> Rice
    //Tiger---> meat ...
    //...


    //使用多态机制，可以统一的管理主人喂食的问题
    //animal 编译类型是Animal,可以指向(接收)Animal子类的对象
    //food 编译类型是Food,可以指向(接收)Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人"+name+"给"+animal.getName() + "喂" + food.getName());
    }
}
