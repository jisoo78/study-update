package com.ohgiraffers.section01.method;

public class Application06 {

    public static void main(String [] args) {

        System.out.println("main() method start...");
        Application06 app6 = new Application06();
        app6.testMethod();
        System.out.println("main() method end...");


    }


    public String testMethod(){
        System.out.println("check");

    return "hello world";
    }
}
