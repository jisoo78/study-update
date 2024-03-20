package com.ohgiraffers.section.pakage_and_import;

public class Application01 {

    public static void main(String[] args) {

    com.ohgiraffers.section.method.Calculator calc = new com.ohgiraffers.section.method.Calculator();
    int min = calc.minNumberOf(30, 20);

        System.out.println("30or20down : " + min);

        int max = com.ohgiraffers.section.method.Calculator.maxNumberOf(30,20);
        System.out.println("30or20down : " +max);



    }
}
