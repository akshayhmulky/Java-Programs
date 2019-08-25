package assignment2;

public class Rectangle {
	
	private int length, breadth;

	//setters
	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void calculatePerimeter() {
		
		int p = 2*(length+breadth); // calculates perimeter
		
		System.out.println(p); 
	}
	
	
}
