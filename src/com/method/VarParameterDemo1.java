package com.method;

public class VarParameterDemo1 {
    public static void main(String[] args) {
        HspMethod m = new HspMethod();
        System.out.println(m.sum(1, 5, 100));
        System.out.println(m.sum(1, 5, 100, 200));

    }
}
class HspMethod{
//    // 重载方法
//    public int sum(int n1, int n2){
//        return n1 + n2;
//    }
//    public int sum(int n1, int n2, int n3){
//        return n1 + n2 + n3;
//    }public int sum(int n1, int n2, int n3, int n4){
//        return n1 + n2 + n3 + n4;
//    }
    //上面方法三个名城相同，功能相同，参数个数不同——>使用可变参数优化
    //1.int...表示接受的是可变参数，类型是int，即可以接收多个int类型的数据
    //2.使用可变参数时，可以当作数组来使用 即nums可以当作数组
    //3.遍历nums求和即可
    public int sum(int... nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += nums[i];
        }
        return res;
    }
}