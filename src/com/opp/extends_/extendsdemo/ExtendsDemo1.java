package com.opp.extends_.extendsdemo;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil("张三", 12,73.5);
        pupil.testing();
        pupil.showInfo();

        Graduate graduate = new Graduate("李四", 20, 65.5);
        graduate.testing();
        graduate.showInfo();


    }
}
