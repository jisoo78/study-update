package com.ohgiraffers.section.pakage_and_import;

import com.ohgiraffers.section01.method.Calculator.*;

import java.util.Date;
import static com.ohgiraffers.section.pakage_and_import.;

public class Application02 {

    public static void main(String[] args ) {



    Calculator calc = new Calculator();
    int min = calc.minNumber0f(50,60);
        System.out.println("50and60down : " + min);

        int max = Calculator.maxNumber0f(50,60);

        System.out.println("50or60up :" + max);
        int max2= maxNumber0f(100,200);
        System.out.println("100or200up : " + max2);
        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());


    }

}
