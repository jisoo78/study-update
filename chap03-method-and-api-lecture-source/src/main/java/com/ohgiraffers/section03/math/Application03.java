package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {

    public static void main(String[] args) {




/*
* 원하는 범위의 난수를 구하는 공식
* random.nextint(구하려는 난수의 갯수) + 구하려는 난수의 최소값
*
*
* */
        Random random = new Random();

        /*0~9까지 난수 발생*/
        int randomNumber1 = random.nextInt(10);
        System.out.println("randomNumber1 = " + randomNumber1);


        /* 1~10까지 난수발생*/
        int randomNumber2 = random.nextInt(10)+1;
        System.out.println("randomNumber2 = " + randomNumber2);

        /*20~45*/
        int randomNumber3 = random.nextInt(26)+20;
        System.out.println("randomNumber3 = " + randomNumber3);

        /*-128~127*/
        int randomNumber4 = random.nextInt(256)-128;

        System.out.println("randomNumber4 = " + randomNumber4);



    }




}
