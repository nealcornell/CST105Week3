package edu.gcu.cst105.week3.wednesday;

public class Rectangle extends Shape {
	private double width;
	private double height;
	@Override
	public double getArea() {		
		return 0;
	}

	@Override
	public double getPerimeter() {		
		return 0;
	}

	@Override
	public String toString() {		
		return null;
	}
	
	public double getWidth() {
		return 0;		
		
	}
	
	public void setWidth() {
		
	}
	
	public double getLength( ) {
		return 0;
		
	}
	
	public void setLength() {
		
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(double width, double height)
}
