package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 회원정보를 관리
        * -> 아이디 , 비밀번호, 이름, 나이 ,성별, 취미
        *
        * */
        String id = "user01";
        String pwd = "pass01";
        String  name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = {"축구","볼링","테니스"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();


        /*
        * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 많은 값들을 인자로 전달해야 해서 한 눈에 안 들ㅇ옴
        * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다(서로 다른 자료형들이기 때문에)
        *
        * */
        /*
        *자료형 변수명 =  new 클래스명(); <- 객체를 생성하는 구문
        *
        * 객체를 생성 하면 클래스에 정의한 필드와 메소드 대로 객체가 생성
        * 아이디 비밀번호 등등 연속된 메모리 주소에서사용하도록 heap에 공간을 만듬
        *
        *
         */

        /*
        * 객체를 생성하고 나면 서로 다른 자료형을 하나의member라는 이름으로 관리할 수 있는 공간을 생성한 것이며
        * heap에 생성되기 때문에 jvm이 지정한 기본값으로 초기화된다
        * */
        Member member = new Member();

        /*
        * 필드에 접근하기 위해서는 레퍼런스변수명.필드명으로 접근한다
        * '.'은 참조연산자라고 하는데, 레퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미를 가진다
        * 각 공간은 필드명으로 접근한다.{배열은 인덱스로접근, 객체는 필드명으로 접근)
        * */

        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        System.out.println("member.hobby = " + member.hobby);


        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"user01"};

        System.out.println("변경 후 member.id : " + member.id);
        System.out.println("변경 후 member.pwd = " + member.pwd);
        System.out.println("변경 후 member.name = " + member.name);
        System.out.println("변경 후 member.age = " + member.age);
        System.out.println("변경 후 member.gender = " + member.gender);
        System.out.println("변경 후 member.hobby = " + member.hobby);

        for (int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
        System.out.println();
    }
}
