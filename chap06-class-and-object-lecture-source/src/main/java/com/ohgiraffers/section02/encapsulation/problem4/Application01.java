package com.ohgiraffers.section02.encapsulation.problem4;

public class Application01 {
    public static void main(String[] args) {


        Monster monster1 = new Monster();
        //private 필드에 직접 접근하여 compiler error발생
        //monster1.name = "밥";
        //monster1.hp = 200;

        monster1.setKinds("밥");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*
        *캡슐화 상속 다형성,(추상화)----4대 특징 / 추상화를 제외하면 3대특징
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하진 못하고
        * public으로 접근을 허용한 메소드만 이용할 수 있도록 해 놓은 것->캡슐화(encapsulation)
        *
        *
        * */







    }
}
