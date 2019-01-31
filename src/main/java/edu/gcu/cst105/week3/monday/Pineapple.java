package edu.gcu.cst105.week3.monday;

public class Pineapple extends Fruit {

	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public void rot(int days) {
		if (days< 7) {  
		 	System.out.println("Please eat me soon!");	 
		 }
		 else if (days < 60 ) {
		 	System.out.println("Eat at your own risk!");
		 }
		 else  {  
		 	System.out.println("Eating me now will make you sick!");
		 }
		
		
	}

	
	
	

}
