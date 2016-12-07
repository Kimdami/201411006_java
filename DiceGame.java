
package com.sd.DiceGame;

class DiceGame{
		
	public void startGame(){
		Player p1 = new Player("A");
		Player p2 = new Player("B");
		p1.play();
		p2.play();
		if(p1.getNum() > p2.getNum()){
			System.out.println(p1.getName()+" Win! ");
		}
		else if(p1.getNum()==p2.getNum()){
			System.out.println("Draw!!!!");
		}
		else
			System.out.println(p2.getName()+"Win!!!");
	

	}
	
public static void main(String[] args){
	DiceGame d = new DiceGame();
	d.startGame();
}
}