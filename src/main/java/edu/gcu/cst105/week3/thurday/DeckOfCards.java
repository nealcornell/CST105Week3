package edu.gcu.cst105.week3.thurday;
import java.util.Random;
import java.util.Scanner;
public class DeckOfCards {
	
static Scanner sc = new Scanner(System.in);
    
    private static String [][] deck = {
            {"H","D","S","C"},
            {"2","3","4","5","6","7","8","9","10","J","Q","K","A"}};
	
		
	public static void main(String[] args) {
		
		 int numCards;
	        String option;
	        do {
	            // Keep asking for number of cards and loop until # between 5 and 10
	            do {
	                System.out.println("How many cards do you want? (5-10) ");
	                numCards = sc.nextInt();
	            } while (numCards > 10 || numCards < 5);
	            
	            Random random = new Random();
	            int value = 0;
	            
	            for (int x = 0; x < numCards; x++) {
	                int suit = random.nextInt(4);
	                int card = random.nextInt(13);
	                System.out.println(deck[0][suit] + "-" + deck[1][card]);
	                
	                switch (deck[1][card]) {
	                case "2": value = value + 2;
	                    break;
	                case "3": value = value + 3;
	                    break;
	                case "4": value = value + 4;
	                    break;
	                case "5": value = value + 5;
	                    break;
	                case "6": value = value + 6;
	                    break;
	                case "7": value = value + 7;
	                    break;
	                case "8": value = value + 8;
	                    break;
	                case "9": value = value + 9;
	                    break;
	                case "10": value = value + 10;
	                	break;
	                case "J": value = value + 10;
	                	break;
	                case "Q": value = value + 10;
	                	break;
	                case "K": value =value + 10;
	                	break;
	                case "A": value = value + 11;
	                    break;
	                default:    value = value + 10;
	                }
	            }
	            System.out.println("Your Total value = " + value);
	            String message = (value > 50) ?  "You won!" : "You lost!";
	            System.out.println(message);
	            System.out.println("Do you want to play again? [Y / N]");
	            option = sc.next().toUpperCase();
	        } while (option.equals("Y"));
	    }
	}
		