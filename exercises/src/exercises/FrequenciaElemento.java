package exercises;

import java.util.Scanner;

class FrequenciaElemento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		String array = sc.nextLine();
		String[] tokens = array.split(" ");
		int[] novoArray = new int[tokens.length];
		
		for(int i = 0; i < tokens.length; i++) {
			novoArray[i] = Integer.parseInt(tokens[i]);
		}
		
		System.out.println(Frequencia(num, novoArray));
	}
	
	public static int Frequencia(int num, int[] nums) {
		int quant = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == num) {
				quant++;
			}
		}
		return quant;
	}
}
