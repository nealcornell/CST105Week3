package edu.gcu.cst105.week3.tuesday;

public abstract class Character {
	// These are private so need Getter/Setter
	// Private attributes and public Get/Set is Encapsulation
	private String name;
	private int health;
	private boolean isAlive = true;
	private char action;
	
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public char getAction() {
		return action;
	}
	public void setAction(char action) {
		this.action = action;
	}
	public abstract void talk(String catchPhrase);
	
	public void displayHealth() {
		System.out.println(this.getName() + " has " + this.getHealth() + " health points ");
		
	}
	
	
	}

