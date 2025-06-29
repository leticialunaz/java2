package exercises;

import java.util.ArrayList;
import java.util.Scanner;

class PosicoesElemento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		sc.nextLine();
		String numeros = sc.nextLine();
	
		String[] array = numeros.split(" ");
		int[] nums = new int[array.length];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(array[i]);
		}
		
		ArrayList<Integer> arrayPosicoes = encontraPosicoes(k, nums);
		System.out.println(arrayEmString(arrayPosicoes));
		
	}
	
	
	
	public static ArrayList<Integer> encontraPosicoes(int k, int[] nums) {
		ArrayList<Integer> posicoes = new ArrayList<>();
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == k) {
				posicoes.add(i);
			} 
		} 
		if(posicoes.isEmpty())
			posicoes.add(-1);
		return posicoes;
		
	}
	
	public static String arrayEmString(ArrayList<Integer> nums) {
		String saida = nums.get(0).toString();
		for(int i = 1; i < nums.size(); i++) {
			saida += " " + nums.get(i);
		}
		
		
		return saida;
	}
}
