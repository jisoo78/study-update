package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * 사과 :  1000원
         * 바나나 : 3000원
         * 복숭아 : 2000원
         * 키위 : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : 바나나
         *
         * -- 출력 예시 --
         * 바나나의 가격은 3000원 입니다.
         * */

        int applep = 1000;
        int bananap = 3000;
        int peachp = 2000;
        int kiwip = 5000;

        System.out.println("--fruit price--");
        System.out.println("apple : " + applep + "won");
        System.out.println("banana : " + bananap + "won");
        System.out.println("peach : " + peachp + "won");
        System.out.println("kiwi : " + kiwip + "won");

        Scanner sc = new Scanner(System.in);
        System.out.println("which fruit : ");
        String string = sc.nextLine();


        if (string.equals("apple")) {
            System.out.println("apple price is :" + applep + "des");
        } else if (string.equals("banana")) {
            System.out.println("banana price is :" + bananap + "des");
        } else if (string.equals("peach")) {
            System.out.println("peach price is :" + peachp + "des");
        } else if (string.equals("kiwi")) {
            System.out.println("kiwi price is : " + kiwip + "des");
        } else {
            System.out.println("out");
        }

    }
}
