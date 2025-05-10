package org.example;

public class Main {
    public static void main(String[] args) {
        Boy boy=new Boy();
        System.out.println(boy.name);
        System.out.println(boy.age);


        Boy boy1=new Boy("星雅",22);
        System.out.println(boy1.name);
        System.out.println(boy1.age);



    }
}