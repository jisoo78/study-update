package com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        System.out.println("main() start...");


    Application01 app1 = new Application01();
    app1.methodA();

        System.out.println("main()end...");

    }
public void methodA(){

    System.out.println("methodA() comehere...");

    methodB();
    System.out.println("methodA() end...");


   }
public void methodB() {

    System.out.println("methodB() comehere...");

methodC();

    System.out.println("methodB() end....");


}

public void methodC(){
    System.out.println("methodC() comehere...");
    System.out.println("methodC() end...");




}


}
