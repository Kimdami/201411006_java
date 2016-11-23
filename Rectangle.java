package com.sd.ch8
class Rectangle{
	int width;
	int height;

	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}

	public int calcArea(){
		return width*height;
	}
}

public static void main(String[] args){
	Rectangle a = new Rectangle();
	a.calcArea();

}