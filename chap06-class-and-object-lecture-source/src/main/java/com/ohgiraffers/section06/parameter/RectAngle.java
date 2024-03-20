package com.ohgiraffers.section06.parameter;

public class RectAngle {

    private double width;
    private double heigth;

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void calcArea(){
        double area = width * heigth;

        System.out.println("이 사각형의 넓이는" + area + "입니다");
    }

    public void calcRound(){
        double round = (width + heigth) * 2;
        System.out.println("이 사각형의 둘레는 " + round + "입니다");
    }
}
