package com.ohgiraffers.setions05.logical;

public class Application02 {

    public static void main(String[] args ){

//1~~100

    int num1 = 55;
        System.out.println("1~100 ok: " + (num1 >= 1 && num1 <= 100));


        int num2 = 155;
        System.out.println("1~100 ok: " + (num1 >= 1 && num1 <= 100));

        char ch1 = 'G';
        System.out.println("AAA ok : " +(ch1 >= 'A' && ch1 <= 'Z'));


        char ch2 = 'g';
        System.out.println("AAA ok : " +(ch2 >= 'A' && ch2 <= 'Z'));

        char ch3 = 'Y';
        System.out.println("y ok? : " + (ch3 == 'y' || ch3 =='Y'));

        char ch4 = 'y';
        System.out.println("y ok? : " + (ch4 == 'y' || ch4 =='Y'));

        char ch5 = 'f';
        System.out.println("english?: " + ((ch5 >= 'A' && ch5 <='Z') || ch5<= 'a' && ch5 <= 'z'));
































    }









}
