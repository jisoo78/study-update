package com.ohgiraffers.section01.method;

public class Application03 {

    public static void main(String[] args){



        Application03 app3 = new Application03();
        app3.testMethod(40);


        int age = 20;
        app3.testMethod(age);

        byte byteAge = 10;
        app3.testMethod(byteAge);


    }


    public void testMethod(int age) {
        System.out.println("your age"  + age + "gg");
    }

}
