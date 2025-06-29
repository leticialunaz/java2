package exercises;

import java.util.Scanner;

public class PrimeiroNegativo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String array = sc.nextLine();
		String[] novoArray = array.split(" ");
		int[] tokens = new int[novoArray.length];
		
		for(int i = 0; i < tokens.length; i++) {
			tokens[i] = Integer.parseInt(novoArray[i]);
		}
		
		System.out.println(PrimeiroNeg(tokens, 0));
	}
	
	
	public static String PrimeiroNeg(int[] tokens, int index) {
		if(index == tokens.length) {
			return "-";
		}
		if(tokens[index] < 0) {
			return String.valueOf(tokens[index]);
		}
		return PrimeiroNeg(tokens, index + 1);
	}
}
