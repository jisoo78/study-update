package com.ohgiraffers.section01.method;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main() start...");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();




        System.out.println("main() end...");
    }

    public void methodA() {

        System.out.println("methodA() come...");
        System.out.println("methodA() end...");
    }

    public void methodB() {

        System.out.println("methodB() come...");
        System.out.println("methodB() end...");


    }

    public void methodC() {

        System.out.println("methodC() come...");
        System.out.println("methodC() end...");


    }
}
