package com.ohgiraffers.setions05.logical;

public class Application03 {

    public static void main(String[] args ) {

    int num1 = 10;

    int result = (false && ++num1 > 0)? num1 : num1;
        System.out.println("&&ok : " + result);

    int num2 = 10;

    int result2 = (true || ++num2 >0)? num2 : num2;
        System.out.println("|| ok : " + result2);
























    }




}
