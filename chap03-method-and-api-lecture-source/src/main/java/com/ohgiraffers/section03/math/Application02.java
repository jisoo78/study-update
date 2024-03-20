package com.ohgiraffers.section03.math;

public class Application02 {

    public static void main(String[] args) {

        /*
        * 난수의 활용
        * Math.random()을 이용해 발생한 난수는0.0~10.까지의 실수 범윙의 난수값을 반환한다
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우들이 존재한다
        * 원하는 범위의 난수를 구하는 공식
        * (int) (Math.random*구하려는 난수의 갯수) + 구하려는 난수의 최소값
        *
        * */



        /*0~9까지 난수발생*/
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1 = " + random1);

        /*1~10까지 난수 발생*/
        int random2 = (int) (Math.random()*10) +1;
        System.out.println("random2 = " + random2);


        /*10~15까지 난수 발생*/
        int random3 = (int) (Math.random()*6)+10;
        System.out.println("random3 = " + random3);


        /*-128~127난수 발생*/
        int random4 = (int) (Math.random() * 256) -128;
        System.out.println("random4 = " + random4);
    }

}
