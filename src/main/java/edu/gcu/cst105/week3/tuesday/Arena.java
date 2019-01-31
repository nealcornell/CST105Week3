package edu.gcu.cst105.week3.tuesday;

import java.util.Random;
import java.util.Scanner;

public class Arena {

	Hero getterman = new Hero();
	Villian setterman = new Villian();
	Scanner sc = new Scanner(System.in);
	
	// Can not access non-static attributes from a static method
	public static void main(String[] args) {
		Arena talkingStick = new Arena();
		talkingStick.nameCharacters();
		talkingStick.talkCharacters();
		talkingStick.doBattle(talkingStick);
}

	private void doBattle(Arena talkingStick) {
		int count = 0;
		while (getterman.getHealth() > 0 && setterman.getHealth() > 0) {				        
	        count++;
	        System.out.println(" Round ");
	        System.out.println(count);
	        talkingStick.getCharacterAction();
	        talkingStick.calculateHealth();
	
		  
		    }
		
		System.out.println("There is a winner!");
	}
	
		
	private void calculateHealth() {
		
		int damage;
		if (getterman.getAction() == 'F')
		{	
			damage = rand_generator(10);
			System.out.println(setterman.getName() + " recieves damage of " + damage + " from "  + getterman.getName());
			setterman.setHealth(setterman.getHealth() - damage);
			setterman.displayHealth();
		}
		else {
			damage = rand_generator(7);
			System.out.println(getterman.getName() + " recieves healing for " + damage);
			getterman.setHealth(getterman.getHealth() + damage);
			getterman.displayHealth();
		}
		if (setterman.getAction() == 'F')
		{	
			damage = rand_generator(10);
			System.out.println(getterman.getName() + " recieves damage of " + damage + " from " + setterman.getName());
			getterman.setHealth(getterman.getHealth() - damage);
			getterman.displayHealth();
		}
		else {
			damage = rand_generator(10);
			System.out.println(setterman.getName() + " recieves healing for " + damage);
			setterman.setHealth(setterman.getHealth() + damage);
			setterman.displayHealth();
		}
	}
	private int rand_generator(int threshold ) {
		Random rand = new Random();
		return rand.nextInt(threshold);
}
	private void nameCharacters() {
		getterman.setName("Thor");
		setterman.setName("Loki");
		getterman.setHealth(rand_generator(80)+50);
		setterman.setHealth(rand_generator(100)+50);
		setterman.displayHealth();
		getterman.displayHealth();		
	}
	
	private void talkCharacters() {
		getterman.talk("By the power of Asgaard!");
		setterman.talk("Dad likes me best!");
	}
	
	private void getCharacterAction() {	
		// Get the action for getterman
		System.out.println("What should " + getterman.getName() + " do?");
		System.out.println("F = Fight :  H = Heal");
		// Take the input as a String and convert to a Char
		getterman.setAction(sc.nextLine().toUpperCase().charAt(0));
		
		// Get the action for setterman
		System.out.println("What should " + setterman.getName() + " do?");
		System.out.println("F = Fight :  H = Heal");
		// Take the input as a String and convert to a char
		setterman.setAction(sc.nextLine().toUpperCase().charAt(0));
		
	}
}
