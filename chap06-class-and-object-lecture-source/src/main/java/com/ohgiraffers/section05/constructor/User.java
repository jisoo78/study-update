package com.ohgiraffers.section05.constructor;

import java.util.Date;

public class User {

    private String  id;

    private String pwd;
    private String name;
    private java.util.Date enrollDate;  //필드로 다른 클래스 자료형으로 사용할 수 있다(ex.String)

    /*
    * 생성자의 작성 위치
    * 작성위치는 문법상으로 클래스 내부에 작성하면 되지만
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다
    *
    * */

    /*
    * 생성자의 사용목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할
    * 목적으로 주로 사용
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다
    * 따라서 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다(초기값 전달 강제화)
    *
    *
    * */

    /*
    * 생성자 작성 방법
    * [표현식]
    * 접근제한자 클래스명(매개변수){
    *       인스턴스 생성 시점에 수행할 명령 기숙(주로 필드를 초기화)
    *       this.필드명 = 매개변수;        // 설정자(setter)  여러개의 기능을 한 번의 호출로 수행할 수 있다
    * }
    *
    * 생성자 작성 시 주의점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다(대/소문자까지도)
    * 2. 생성자 메소드는 반환형을 작성하지 않는다(작성하는 경우 생성자가 아닌 메소드로 인식
    * */

    /*
    * 생성자의 종류
    * 1. 기본생성자(매개변수가 없는 생성자)
    * 2. 매개변수가 있는 생성자
    *
    * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성가능
    * 매개변수가 있는 생성자가 한개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
    * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야한다
    *
    * */
    // default contructor 기본생성자
    public User() {
        System.out.println("User 클래스의 기본생성자를 호출함...");
    }


    //동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다(compile error)
    // public User(){}

    /*
    * 매개변수가 있는 생성자
    * 초기화할 필드가 여러 개 인 경우 초기화 하고 싶은 필드의 갯수별로 생성자를 여러 개 준비할 수 있다
    * */

    /*
    * id pwd name의 초기화를 담담할 생성자
    * */


    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("User 클래스의 id,pwd,name을 초기화하는 생성자 호출됨...");

    }

    /* 모든 필드를 초기화하는 생성자*/

    public User(String id, String pwd, String name, Date enrollDate) {
     //   this.id = id;
     //   this.pwd = pwd;
     //   this.name = name;
        /*this()사용하기
        * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다
        * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다(메소드와 동일)
        * 리턴되어 돌아오지만 리턴값은 존재하지 않는다
        * this()는 가장 첫 줄에 선언해야하며 그렇지 않은 경우 컴파일에러발생
        *  */
        this(id, pwd, name);
        this.enrollDate = enrollDate;
        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출됨...");
    }
    /*
    * 복사 생성자
    * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화값으로 이용가능
    * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다(깊은복사)
    *
    * */
    public User(User otherUser) {
     //   this.id = otherUser.id;
     //   this.pwd = otherUser.pwd;
      //  this.name = otherUser.name;
      //  this.enrollDate = otherUser.enrollDate;
     //   this(otherUser.id, otherUser.pwd, otherUser.enrollDate);

        System.out.println("User클래스의 복사생성자 호출함...");
        System.out.println("this의hashCode : " + this.hashCode());
        System.out.println("otherUser의hashCode : " + otherUser.hashCode());

    }




    public String getInformation(){
        return "id = "
                + this.id + " ,"
                + "pwd = " + this.pwd + " ,"
                + "name = " + this.name + " ,"
                + "enrollDate = " + this.enrollDate;
    }






















}
