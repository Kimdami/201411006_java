package com.sd.ch2;

public class BMI{

    
    public void CalBMI(double weight, double height){
        double bmi = weight/(height*height);
        if(bmi<=18.5){
            System.out.println("Low Weight");
        }
        else if(bmi>18.5 && bmi<=25){
            System.out.println("Normal Weight");
        }
        else{
            System.out.println("Over Weight");
        }
        
        
    }
    
    public static void main(String[] args){
           BMI b = new BMI();
           b.CalBMI(69.0,1.72);
    }
    
}