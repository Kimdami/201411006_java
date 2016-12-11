package com.sd.YutGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


class SimpleGUI extends JFrame implements ActionListener{
  

        JFrame frame;
        static JPanel panel;
        static JTextArea textArea;
        static JButton start,yut,reset,mal;
        static ImageIcon image ;
       
        YutGame y;
        
    public void sayHello(){
    	
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        image = new ImageIcon("Yut01.jpg");
    
        panel=new JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(image.getImage(),50,40,null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };

        panel.setLayout(null); 
        panel.setBounds(0, 0, 500, 500);
        

        textArea = new JTextArea(); 
        textArea.setBounds(50, 550, 480 , 100); 
        textArea.setEditable(false);


        start=new JButton("Start");
        yut=new JButton("Yut");
        reset=new JButton("Reset");
              
        mal = new JButton("A");
        mal.setBounds(900,900,50,50);
        panel.add(mal);

        start.setBounds(75, 680, 200, 50); 
        yut.setBounds(250, 390, 80, 50);
        reset.setBounds(300, 680, 200, 50);
        

        panel.add(textArea);
        panel.add(start);
        panel.add(yut);
      
        panel.add(reset);

        start.addActionListener(this);
        yut.addActionListener(this);
        reset.addActionListener(this);
        
        
        frame.add(panel);
        frame.setSize(610,800);
        frame.setVisible(true);

    }
 
       public void actionPerformed(ActionEvent e){
           Object source=e.getSource();
            
            if(source==start){

                y = new YutGame();
            	
                y.startGame();
                
                mal.setBounds(475,460,30,30);
            }
            
             else if(source==yut){
            	 
                y.ThrowYut();
                
                int PlayerYutPoint_1 = y.p1.getYutPoint();
                int xPos = y.getXPos(PlayerYutPoint_1);
                int yPos = y.getYPos(PlayerYutPoint_1);
                                           
                mal.setBounds(xPos, yPos, 30, 30);
              
                
            }
            else if(source==reset){
                textArea.setText(null);
                mal.setBounds(900,900,50,50);
            }  
        }
   }    
    