package com.ohgiraffers.section03.avstraction;

public class CarRacer {

   private final Car car = new Car();

   public void startUp() {
       car.startUp();
   }

   public void stepAccelator() {
       car.go();
   }
   public void stepBack(){
       car.stop();
   }

   public void turnOff(){
       car.turnOff();
   }
}
