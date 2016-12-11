package com.sd.YutGame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


public class YutPlayer extends SimpleGUI{
	
    static String name=null;
    static int num=0;
    static int yutPoint = 0;
    Yut d;
    
    public YutPlayer(String name) {
        this.name= name;
    }
    
    
    public void InitYut(){
    	
    	d = new Yut();
    	
    	textArea.append("Init Yut\n");
    	
    }
    
    public void play() {
         
    	if( d == null )
    		return;
    	
        int yut = d.roll();
        
        
        if( yut == 1 ){
            textArea.append("Do!!\n");
        }else if( yut == 2 ){
            textArea.append("Gae!!\n");
        }else if( yut == 3 ){
            textArea.append("Gul!!\n");
        }else if( yut == 4 ){
            textArea.append("Yut!!\n");
        }else if( yut == 5 ){
            textArea.append("Mo!!\n");
        }
        
        yutPoint += yut;
       
    }
   
    public String getName(){
    	return this.name;
    }
  
    public int getYutPoint(){
    	return this.yutPoint;
    }
}