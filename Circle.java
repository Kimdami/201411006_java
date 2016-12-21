package com.sd.ch8;

public class Circle extends Point{
    double radius;
    public Circle(int x, int y, double r){
        super(x,y);

        this.radius = r;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    
}