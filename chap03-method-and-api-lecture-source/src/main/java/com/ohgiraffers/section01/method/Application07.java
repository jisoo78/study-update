package com.ohgiraffers.section01.method;

public class Application07 {

    public static void main(String[] args ){


        int first = 20;
        int second = 10;

        Application07 app7 = new Application07();
        System.out.println("add: " + app7.plusTwoNumbers(first,second));
        System.out.println("add: " + app7.minusTwoNumbers(first,second));
    }

    public int plusTwoNumbers(int first, int second) {

        return first +second;
    }

    public int minusTwoNumbers(int first, int second) {

        return first - second;
    }


    public int multipleTwoNumbers(int first, int second) {

        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {

        return first / second;
    }


}
