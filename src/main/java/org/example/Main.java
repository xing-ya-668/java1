package org.example;

public class Main {



    public static void main(String[] args) {
        chu("星雅");
        chu("好东西",666);

        System.out.println("程序开始。。。");
        chu(10,0);
        System.out.println("结束");



        System.out.println("Hello world!");
    }
    public static void chu(int a ,int b){
        if (b==0) {
            System.out.println("不执行");
            return;//关键字
        }
        int c=a/b;
        System.out.println("结果为："+c);


    }
     public static void chu(String aa){

        System.out.println("指定"+aa);

    }
    public static void chu (String bb , int cc){//方法重载
        System.out.println("指定多个"+bb+"和"+cc);


    }

}