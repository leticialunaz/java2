package exercises;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String args[]) {
		//Get the number of hours
		System.out.println("Enter the number of hours the employee worked.");
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		
		//Get the hourly pay rate
		
		System.out.println("Enter the employee's pay rate.");
		double payRate = sc.nextDouble();
		sc.close();
		
		double result = payRate * hours;
		
		System.out.print("The employee's gross pay is $" + result);
		
		
	
	}
}
