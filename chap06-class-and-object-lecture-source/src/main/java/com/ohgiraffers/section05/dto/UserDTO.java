package com.ohgiraffers.section05.dto;

import java.util.Date;

public class UserDTO {

    /*
    * 자바빈(Java Bean)이란?
    * JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스이다
    * 자바코드를 모르는 웹 퍼블리셔들도 자바코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미
    * 그 때 사용할 수 있도록 규칙을 지정해 놓은 Java클래스를 자바빈(java Bean)이라 부른다
    * 지금은 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 된다
    *
    * */

    /*
    * 자바빈 작성 규칙
    * 자바빈은 특정 패키지에 속해있어야한다(default패키지 사용금지)
    * 멤버변수의 접근제어자는 private로 선언
    * 기본생성자가 명시적으로 존재해야한다(매개변수 있는 생성자는 선택사항)
    * 모든 멤버변수에 접근 가능한 설정자와 접근자가 public으로 작성되어 있어야 함
    * 직렬화(Seriablizable 구현)가 되어야 한다(선택사항)
    *
    * */


    /*
     * 기본생성자 명시적으로 작성
     * 매개변수 있는 생성자를 선택적으로 추가할 수 있도록 기본생성자를 명시
     * (명시하지 않고 추후 매개변수 있는 생성자를 추가할 시 에러 발생 가능성이 있다)
     * */
    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO() {

    }

    public UserDTO(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInformation() {
        return "id = " + this.id + ", pwd = " + this.pwd + ", nme = " + this.name + ", enrollDate = " + this.enrollDate;

    }
}
