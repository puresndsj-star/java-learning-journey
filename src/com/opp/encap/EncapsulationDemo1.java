package com.opp.encap;



public class EncapsulationDemo1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("sahdkhkjsah");
        person.setAge(18);
        person.setSalary(10000);
        person.info();
        System.out.println(person.getSalary());
        //如果我们自己使用构造器指定属性
        Person person1 = new Person(18, 10000, "sahdkhkjsah");
        System.out.println("====person1的信息======");
        person1.info();
    }

}
/*
那么在java中如何实现这种类似的控制呢?
请大家看一个小程序(com.hspedu.encap: Encapsulation01.java),
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name的长度在 2-6字符 之间
*/
class Person{
    private int age;
    private double salary;
    public String name;
    //构造器

    public Person() {
    }

    public Person(int age, double salary, String name) {
//        this.age = age;
//        this.salary = salary;
//        this.name = name;
        //我们可以将set方法写在构造器中，这样仍然可以验证
        setAge(age);
        setName(name);
        setSalary(salary);
    }
    //自己写setXxx 和 getXxx 太慢，我们使用快捷键
    //然后根据要求来完善我们的代码

    public void setName(String name) {
        //加入对数据的校验,相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要(2-6)个字符，默认名字");
            this.name = "无名人";
        }
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        //判断
        if (age > 0 && age <= 120) {//如果是合理范围
            this.age = age;
        } else {
            System.out.println("你设置年龄不对，需要在 (1-120), 给默认年龄18");
            this.age = 18;
        }
    }
    public int getAge() {
        return age;
    }

    public double getSalary() {
        //可以这里增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public void info() {
        System.out.println("name = " + name + ", age = " + age + ", salary = " + salary);
    }
}