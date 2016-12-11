package com.sd.YutGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;



class YutGame extends SimpleGUI {

	YutPlayer p1;
	int num = 0;
	
	int pointX[];
	int pointY[];


	public void startGame() {

		textArea.setText("Start!!\n");
		
		p1 = new YutPlayer("A");
		p1.InitYut();
		
		pointX = new int[20];
		pointY = new int[20];
		
		pointX[0] = 475; pointY[0] = 460;
		pointX[1] = 475; pointY[1] = 380;
		pointX[2] = 475; pointY[2] = 310;
		pointX[3] = 475; pointY[3] = 230;
		pointX[4] = 475; pointY[4] = 160;	
		pointX[5] = 475; pointY[5] = 65;	
		


		pointX[6] = 380; pointY[6] = 65;
		pointX[7] = 310; pointY[7] = 65;
		pointX[8] = 240; pointY[8] = 65;
		pointX[9] = 190; pointY[9] = 65;
		pointX[10] = 130; pointY[10] = 65;	
		

		pointX[11] = 75; pointY[11] = 160;
		pointX[12] = 75; pointY[12] = 230;
		pointX[13] = 75; pointY[13] = 310;
		pointX[14] = 75; pointY[14] = 380;
		pointX[15] = 75; pointY[15] = 460;	
		
		pointX[16] = 170; pointY[16] = 460;
		pointX[17] = 240; pointY[17] = 460;
		pointX[18] = 310; pointY[18] = 460;
		pointX[19] = 380; pointY[19] = 460;

	}

	public void ThrowYut() {
		
		textArea.setText("Throw Yut!!\n");
		
		p1.play();
		
		if( p1.getYutPoint() > 19 ){
			textArea.setText("Game End!!\n");
		}

	}

	public int getNum() {
		return p1.getYutPoint();
	}
	
	public int getXPos( int i ){
		return pointX[i];
	}
	
	public int getYPos( int i ){
		return pointY[i];
	}
}
