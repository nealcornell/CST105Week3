package edu.gcu.cst105.week3.thurday;

public class TryCatch {

	public static void main(String[] args) {
		
		int [] x = {3,7,2,4};
		try {
		System.out.println(x[6]);
		}
		catch(Exception e) {
			System.out.println("Hey dummy!");
		}
		System.out.println("hello from the end");
		
		int a = 7;		
		int b = 0;
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("He He He... Sucka!");
		}
	}

}
