package edu.gcu.cst105.week3.tuesday;

public class Hero extends Character implements Moves {

	private int morals = 75;  // Range is 0-100
	
	public int getMorals() {
		return morals;
	}

	public void setMorals(int morals) {
		this.morals = morals;
	}
	
	public int fight(String move) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int heal(String move) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void talk(String catchPhrase) {
		System.out.print(this.getName() + " says, \"" );
		System.out.print(catchPhrase );
		System.out.println("\", With a smile. ");
		
	}

	

}
