package ua.lviv.trainapplogos;

public class Rectangle {
	private int length;
	private int width;
	
	Rectangle () {
		this.length = 15;
		this.width = 20;
	}
	
	
	Rectangle (int width, int length) {
		this.width = width;
		this.length = length;
		
	}
	
	public int Square () {
		return this.length * this.width;
	}
	
	public int Perimeter () {
		return this.length * 2 + this.width * 2;
	}
	

}
