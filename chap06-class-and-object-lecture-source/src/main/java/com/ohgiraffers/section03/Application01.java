package com.ohgiraffers.section03;

import com.ohgiraffers.section02.encapsulation.problem4.Monster;

public class Application01 {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
    //monster1.setInfo("드라큘라");
    monster1.setHp(200);

    Monster monster2 = new Monster();
   // monster2.setInfo("프랑크");
    monster2.setHp(400);


    Monster monster3 = new Monster();
  //  monster3.setInfo("미라");
    monster3.setHp(300);


        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());





    }
}
