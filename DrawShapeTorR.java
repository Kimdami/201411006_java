

package com.sd.Draw;
import ch.aplu.turtle.*;
 
 class DrawShapeTorR{

     static Turtle t1 = new Turtle();

     enum Shape{TRIANGLE, RECTANGLE}

     public static void drawShapeTorR(int size, int sides, double angle){
         t1.home();
         t1.clean();
         for(int i=0; i<sides; i++){
             t1.forward(size);
             t1.right(angle);
         }
     }
     public static void main(String[] args) {
         int size = 100;
         int sides = 0;
         double angle = 0;

         Shape sel = Shape.RECTANGLE;
         switch(sel) {
           case TRIANGLE:
             sides = 3;
             angle = 120;
             break;
           case RECTANGLE:
             sides = 4;
             angle = 90;
             break;
         }
         
        
        drawShapeTorR(size, sides, angle);
        
     }
 }