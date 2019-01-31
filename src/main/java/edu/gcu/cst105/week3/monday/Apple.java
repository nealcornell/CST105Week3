package edu.gcu.cst105.week3.monday;

public class Apple extends Fruit {

	private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void rot(int days) {
		 if (days< 10) {  
		 	System.out.println("Fruit is good to eat");	 
		 }
		 else if (days < 30 ) {
		 	System.out.println("Fruit is rotting quickly should not eat!");
		 }
		 else  {  
		 	System.out.println("Do not eat or you will be sick!");
		 }
	}
	

}
