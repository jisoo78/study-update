package com.ohgiraffers.subProject.coffee01;

public class Barista {

    /*
    * 주문에 따라 커피를 만들어라(커피를 제공)
    * */
    private int coffeeStock = 5000; //5000g커피보유

    public Coffee[] makeCoffee(Order order) {

        // 재고차감처리-커피한잔에 20g사용

        //커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        for (int i =0; i <coffees.length; i++){
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());

        }


        return coffees;
    }




}
