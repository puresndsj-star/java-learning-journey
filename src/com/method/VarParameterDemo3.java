package com.method;

public class VarParameterDemo3 {
    public static void main(String[] args) {
        HspMethod1 t1 = new HspMethod1();
        System.out.println(t1.showScore("chiikawa",60.2f,70.5f));
        System.out.println(t1.showScore("chiikawa",60.2f,70.5f,80.0f));
        System.out.println(t1.showScore("chiikawa",60.2f,70.5f,80.0f,90.0f,100.0f));

    }
}
class HspMethod1{
    public String showScore(String name, float... scores){
        float res = 0;
        for (int i=0;i<scores.length;i++){
            res+=scores[i];
        }
        return name+scores.length+"门课总分："+res;
    }

}