package com.sd.gui;
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
     JTextField radiusTf1;
     JTextField areaTf2;
     JButton b1;
     JButton b2;
     public CalcAreaGUIMain2(){
         JPanel panel = new JPanel(new GridLayout(3,2));
         getContentPane().add(panel);
         JLabel lable1 = new JLabel("diameter");
         JLabel lable2 = new JLabel("area");
         radiusTf1 = new JTextField(20);
         areaTf2 = new JTextField(20);
         b1 = new JButton("Calculation");
         b2 = new JButton("Cencel");
         b1.addActionListener(this);
         b2.addActionListener(this);
         panel.add(lable1);
         panel.add(radiusTf1);
         panel.add(lable2);
         panel.add(areaTf2);
         panel.add(b1);
         panel.add(b2);
         pack();
         setVisible(true);
     }
 
     public void actionPerformed(ActionEvent e){
         Object source = e.getSource(); 
         
         if(source==b1){
             Double r = Double.parseDouble(radiusTf1.getText()); 
             areaTf2.setText(Double.toString((Math.PI*Math.pow(r,2))));
             b1.setText("CaulcArea");
         }
         else if(source==b2){
             areaTf2.setText("");
         }
 
     }
     
     
     public static void main(String[] args){
         CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
         c.pack();
         c.setVisible(true);
         c.setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
 } 