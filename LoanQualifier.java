package exercises;

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {
		
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;
		
		System.out.println("Enter your salary:");
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		
		System.out.println("Enter the number of years with your current employer: ");
		double years = sc.nextDouble();
				
		sc.close();
		
		if(salary >= requiredSalary) {
			if(years >= requiredYearsEmployed) {
				System.out.println("Congrats! You qualify for the loan");
			} else {
				System.out.println("Sorry, you must have worked ate your current job " + requiredYearsEmployed + " years");
			}
		} else {
			System.out.println("Sorry, you must earn at least $ " + requiredSalary);
		}
	}
}

