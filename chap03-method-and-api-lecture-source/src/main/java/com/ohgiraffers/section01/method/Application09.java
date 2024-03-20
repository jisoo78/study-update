package com.ohgiraffers.section01.method;

public class Application09 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;



        Calculator calc = new Calculator();
        int min = calc.minNumber0f(first,second);
        System.out.println("minadd: " + min);


        int max = maxNumber0f(first, second);

        int max =Calculator.maxNumber0f(first,second);
        System.out.println("maxadd: " + max);



int max2 = calc.maxNumber0f(first, second);
        System.out.println("maxadd: " + max2);

    }


}
