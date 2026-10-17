package com.opp.extends_.extendsexercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        Pc pc = new Pc("Intel", 16, 512, "拯救者");
//        pc.printInfo();
//        pc.getDetails();
        System.out.println(pc.getDetails());
        Notepad notepad = new Notepad("Intel", 12, 1024, "白色");
//        notepad.printInfo();
//        notepad.getDetails();
        System.out.println(notepad.getDetails());
    }
}
class Computer{
    private String cpu;
    private int memory;
    private int disk;
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    //自己写的getDetails方法，打印computer信息
//    public void getDetails() {
//        System.out.println("cpu:" + cpu + " memory:" + memory + " disk:" + disk);
//    }
    //返回computer信息
    public String getDetails(){
        return "cpu:"+cpu+" memory:"+memory+" disk:"+disk;
    }
}



class Pc extends Computer{
    private String brand;
    //这里IDEA 根据继承的规则，自动把构造器的调用写好
    //这里也体现： 继承设计的基本思想，父类的构造器完成父类属性初始化
    //子类的构造器完成子类属性初始化
    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    //自己写的getDetails方法（重写）
//    public void getDetails(){
//        super.getDetails();
//        System.out.println(" brand:"+brand);
//        //运算符 '+' 不能应用于 'void'、'java.lang.String'
////        System.out.println(super.getDetails() + " brand:"+brand);//报错
//    }

    //升级重写getDetails方法

    @Override
    public String getDetails() {
//        String Details = super.getDetails()+" brand:"+brand;
//        return Details;
        return super.getDetails()+" brand:"+brand;
    }


    //打印Pc信息
//    public void printInfo(){
//        System.out.println("Pc info:");
//        System.out.println("cpu:" + getCpu() + " memory:" + getMemory()
//                + " disk:" + getDisk() + " brand:" + brand+" 必须写getter（）（单个属性返回）");
//        System.out.println(getDetails() + " brand:" + brand+" 本类没有看父类getDetails（）");
//        System.out.println(super.getDetails() + " brand:" + brand+" 继承父类方法");
//    }
}



class Notepad extends Computer{
    private String color;
    public Notepad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    //自己写的getDetails方法（）（重写）
//    public void getDetails(){
//        super.getDetails();
//        System.out.println(" color:"+color);
//    }

    //升级重写getDetails方法
    @Override
    public String getDetails() {
        return super.getDetails()+" color:"+color;
    }
//    public void printInfo(){
//        System.out.println("Notepad info:");
//        System.out.println("cpu:" + getCpu() + " memory:" + getMemory()
//                + " disk:" + getDisk() + " color:" + color+" 必须写getter（）（单个属性返回）");
//        System.out.println(getDetails() + " color:" + color+" 本类没有看父类getDetails（）");
//        System.out.println(super.getDetails() + " color:" + color+" 继承父类方法");
//    }

}