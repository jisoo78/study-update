package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        System.out.println("10, 20 add?: " + Application08.sumTwoNumbers(10,20));


        System.out.println("10, 20 add?: " + sumTwoNumbers(10, 20));


    }

    public static int sumTwoNumbers(int first, int second) {

        return first + second;
    }
}
