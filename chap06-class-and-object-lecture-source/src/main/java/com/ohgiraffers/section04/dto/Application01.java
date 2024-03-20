package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section01.user_type.Member;

public class Application01 {
    //dto data tranksfer Object
    //ov value Object
    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(184.7);
        member.setWeight(75.5);
        member.setActivated(true);


        System.out.println("회원번호 : " + member.getNumber());
        System.out.println("회원명 : " + member.getName());
        System.out.println("나이 : " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("키 : " + member.getHeight());
        System.out.println("무게 : " + member.getWeight());
        System.out.println("회원활성화상태 : " + member.isActivated());

    }

}
