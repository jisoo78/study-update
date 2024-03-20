package com.ohgiraffers.section06.parameter;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스자료형
        * 4. 클래스자료형 배열
        * 5. 가변인자
        *
        * */


        ParameterTest pt = new ParameterTest();

        /*기본자료형
        * 기본자료형 8가지 모두 가능하다
        * */
        int num1 = 20;
        pt.testPrimaryTypeParameter(num1);

        /*2.기본자료형배열*/
        int[] iarr = {1,2,3,4,5};
        System.out.println("인자로 전달하는 값: " + iarr);
        pt.testPrimaryTypeParameter(iarr);

        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");
        }
        System.out.println();

        /*클래스자료형*/
        RectAngle r1 = new RectAngle();
        System.out.println("인자로 전달하는 값 : " + r1);   //생성된 주소값
        pt.testPrimaryTypeParameter(r1);

        System.out.println("변경 후 사격형의 넓이와 둘레===========");
        r1.calcArea();
        r1.calcRound();

        /*가변인자*/
        pt.testVariableLengthArrayParameter();      //비워두면 에러남
        pt.testVariableLengthArrayParameter("홍길동"); //가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순","볼링");
        pt.testVariableLengthArrayParameter("신사임당","떡썰기");
        pt.testVariableLengthArrayParameter("이순신","축구", "족구");



    }
}
