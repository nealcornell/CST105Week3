package edu.gcu.cst105.week3.wednesday;

public abstract class Shape {

	 		
		private String color;
		private boolean filled;
		
		public Shape() {
		}
		public Shape(String color, boolean filled) {
			this.color = color;
			this.filled = filled;
		}
		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
		}
		/**
		 * @param color the color to set
		 */
		public void setColor(String color) {
			this.color = color;
		}
		/**
		 * @return the filled
		 */
		public boolean isFilled() {
			return filled;
		}
		/**
		 * @param filled the filled to set
		 */
		public void setFilled(boolean filled) {
			this.filled = filled;
		}
		
		public abstract double getArea();
		public abstract double getPerimeter();
		public String toString() {
			return "A";
			
		}
		
	}
		
		
