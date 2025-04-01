package exercises;

import java.util.Scanner; 

public class Test {
	public static void main(String[] args) {
		//ask the season
		System.out.println("Enter a season.");
		Scanner sc = new Scanner(System.in);
		String season = sc.nextLine();
		//a whole number
		System.out.println("Pick a number.");
		int number = sc.nextInt();
		//an adjective
		System.out.println("Enter an adjective.");
		String adjective = sc.next();
		
		System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
		
		sc.close();
	}
}
