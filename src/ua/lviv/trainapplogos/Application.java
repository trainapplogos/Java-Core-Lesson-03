package ua.lviv.trainapplogos;

public class Application {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		
		System.out.println("Determined square of rectangle = " + rec.Square()); 
		System.out.println("Determined perimeter of rectangle = " + rec.Perimeter()); 
		
		Rectangle rec2 = new Rectangle(12, 30);
		
		System.out.println("New square of rectangle = " + rec2.Square()); 
		System.out.println("New perimeter of rectangle = " + rec2.Perimeter()); 
		
		Circle cr = new Circle();
		
		System.out.println("\nRadius = 25.2, diameter = 635.04");
		System.out.println("Determined square of circle = " + cr.Square()); 
		System.out.println("Determined length of circle = " + cr.Length()); 
		
		Circle cr2 = new Circle(31.32, 980.9424);
		System.out.println("\nRadius = 31.32, diameter = 980.9424");
		System.out.println("New square of circle = " + cr2.Square()); 
		System.out.println("New length of circle = " + cr2.Length()); 
	}

}
