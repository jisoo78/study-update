package com.ohgiraffers.section03.avstraction;

public class Car {

    private boolean isOn;      //초기에는 시동이 꺼진false상태

    private int speed;

    /***
     * 시동을 켜는 기능
     */

    void startUp() {

        if (isOn) {

            System.out.println("이미 시동이 걸려있다");
        } else {
            this.isOn = true;
            System.out.println("시동걸림 출발준비완료");
        }
    }

    /**
     * 시동이 걸린 상태인 경우
     * 호출시마다 시속10씩 증가시키는 메소드
     */
    public void go() {

        if (isOn) {
            System.out.println("차가 앞으로 움직입니다");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h입니다 ");
        } else {
            System.out.println("시동이 걸리지 않음 시동먼저 거십시오");
        }

    }

    /*
     * 차를 멈추는 기능
     * */
    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다 차를 멈춥니다");
            } else {
                System.out.println("차는 이미 멈춰있습니다");
            }
        } else {
            System.out.println("차에 시동이 걸려있지 않습니다 시동을 먼저 걸어주십시오");
        }

    }
    public void turnOff() {
        if (isOn){
            if (speed>0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다 차를 멈추십시오");
            }else {
                this.isOn = false;
            System.out.println("시동을 끕니다 다시 운행할려면 시동을 켜주십시오");
            }
        }else{
            System.out.println("이미 시동이 꺼져있습니다 시동상태를 확인하십시오");
        }
    }
}
