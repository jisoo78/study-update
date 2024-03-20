package com.ohgiraffers.section02.encapsulation.pronblem1;

import com.ohgiraffers.section01.user_type.Member;

public class Application01 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.name = "삐삐";
        monster1.hp =200;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster1.hp = " + monster1.hp);

        Monster monster2 = new Monster();
        monster2.name = "빠빠";
        monster2.hp = -200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.hp = " + monster2.hp);
        
        
        Monster monster3 = new Monster();
        monster3.name = "뽀뽀";
        monster3.setHp(200);
        
        Monster monster4 = new Monster();
        monster4.name = "뻐뻐";
        monster4.setHp(-1000);

        System.out.println("monster3.name = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);

        System.out.println("monster4.name = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
        
        
        
        
    }
}
