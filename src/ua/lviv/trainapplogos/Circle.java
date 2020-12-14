package ua.lviv.trainapplogos;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle () {
		this.radius = 25.2;
		this.diameter = 635.04;
	}
	
	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	
	public double Square () {
		return Math.PI * Math.pow(this.diameter / 2, 2);
		
	}
	
	public double Length () {
		return 2 * Math.PI * this.radius;	
	}
	
	
	
}
