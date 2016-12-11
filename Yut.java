package com.sd.YutGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


class Yut extends SimpleGUI{
	
	String name;
    private int number = 0;
    
    public int roll() {   
    	
        number = (int) (Math.random() * 5) + 1;
      
 		return number;     
    }   
}