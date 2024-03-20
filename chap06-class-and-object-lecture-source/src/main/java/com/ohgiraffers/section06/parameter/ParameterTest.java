package com.ohgiraffers.section06.parameter;

public class ParameterTest {
    public void testPrimaryTypeParameter(int num1) {
        System.out.println("매개변수로 전달받은 값 : " + num1);
    }

    public void testPrimaryTypeParameter(int[] iarr) {
        /*
        * 인자로 전달하는 배열의 매개변서로 전달받은 배열은
        * 서로 동일한 배열을 가리킨다(얕은복사)
        * */



        System.out.println("매개변수로 전달받은 값 : " + iarr);

        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();

        iarr[0]= 999;
    }

    public void testPrimaryTypeParameter(RectAngle r1) {


        /*
        * 매개변수 r1에도 인스턴스 주소가 전달됨
        * 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일
        * 인스턴스를 가리킨다(얕은복사)
        *
        * */

        System.out.println("매개변수로 전달받은 값 : " + r1);
        System.out.println("변경 전 사격형의 넓이와 둘레===========");
        r1.calcArea();
        r1.calcRound();


        r1.setWidth(100);   //자동형변환 적용됨
        r1.setHeigth(100);

        System.out.println("변경 후 사격형의 넓이와 둘레===========");
        r1.calcArea();
        r1.calcRound();


    }
    public void testVariableLengthArrayParameter(String name, String...hoby){
        /*
        * 가변길이의 배열은 몇 개가 매개변수로 전달될지 모르는 상황이기에
        * 이름과 구분하기 위해 뒤쪽에 작성해야한다
        * */

//        System.out.println("이름 : " + name);
//        System.out.println("취미갯수 : " + hobby.length);
//        System.out.print("취미 : " );
//        for (int i = 0; i < hobby.length; i++){
//            System.out.println(hobby[i] + " ");
//        }
//        System.out.println();
    }

    public void testVariableLengthArrayParameter() {
    }
}
