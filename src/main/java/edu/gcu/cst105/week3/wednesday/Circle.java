package edu.gcu.cst105.week3.wednesday;

public class Circle extends Shape {
	
	private double radius;
	 
	public Circle(double radius, String color, boolean filled) {
		super.setColor(color);
		super.setFilled(filled);
		this.radius = radius;
	}	 
	
	public Circle() {
	 }
	@Override
	public double getArea() {
		double area = this.radius * this.radius * 3.14;
		return area;
	}

	@Override
	public double getPerimeter() {		
		double perimeter = this.radius * 2 * 3.14;
		return perimeter;
	}

	@Override
	public String toString() {	
		String hold;
		hold =  "Color: " + super.getColor() + "\n";
		hold += "Filled:" + super.isFilled() + "\n";
		hold += ""
	}
	
	public double getRadius() {
		return 0;
		
	}
	
	public void setRadius() {
		
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
