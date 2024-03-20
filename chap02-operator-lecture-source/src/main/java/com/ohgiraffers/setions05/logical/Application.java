package com.ohgiraffers.setions05.logical;

public class Application {

    public static void main(String[] args) {

        System.out.println("and: " + (true&&true));
        System.out.println("and: " + (true&&false));
        System.out.println("and: " + (false&&true));
        System.out.println("or: " + (true||true));
        System.out.println("or: " + (true||false));
        System.out.println("or: " + (false||false));



        System.out.println("not: " + (!true));
        System.out.println("not: " + (!false));


        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println("a<b or c<d: " + (a<b || c<d));
        System.out.println("a<b or c>d: " + (a<b || c>d));
        System.out.println("a>b or c<d: " + (a>b || c<d));
        System.out.println("a>b or c>d: " + (a>b || c>d));

        System.out.println("a<b or c<d: " + (a<b || c<d));
        System.out.println("a<b or c>d: " + (a<b || c>d));
        System.out.println("a>b or c<d: " + (a>b || c<d));
        System.out.println("a>b or c>d: " + (a>b || c>d));






























    }


}
