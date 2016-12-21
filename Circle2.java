package com.sd.ch8;
 import java.lang.Math;
 
 public class Circle2 extends Shape{
     private double radius;
     private double area;
     private double perimeter;
     public Circle2(double r){
         this.radius = r;
         this.area=Math.PI*r*r;
         this.perimeter=2*Math.PI*r;
     }
     @Override
     public double calcArea(){
         return this.area;
     }
     @Override
     public double calcPerimeter(){
         return this.perimeter;
     }
     public String toString() {
         return "Circle..."+super.toString();
     }
 }