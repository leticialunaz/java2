package exercises;

import java.util.Scanner;

public class SalaryCalculator {
	public static final int MIN_SALES = 10;
	public static void main(String args[]) {
		int salary = 1000;
		int bonus = 250;
		
		System.out.println("How many sales did the employee make this week?");
		Scanner sc = new Scanner(System.in);
		int sales = sc.nextInt();
		
		if(sales >= MIN_SALES){
			System.out.println("Congrats! You've met your quota");
			salary = salary + bonus;
		} else {
			int salesShort = MIN_SALES - sales;
			System.out.println("You did not make your quota. You were " + salesShort + " sales short");
		}
		
		System.out.println("The employee's pay is $" + salary);
		sc.close();
	}
}
