package exercises;

import java.util.Arrays;
import java.util.Scanner;

class QuickSort {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) 
			nums[i] = Integer.parseInt(array[i]);	
		
		quickSort(nums, 0, nums.length - 1);
	}
	
	
	
	public static void quickSort(int[] v, int ini, int fim) {
		if(ini < fim) {
			int indexPivot = particionamento(v, ini, fim);
			System.out.println(saida(v));

			quickSort(v, ini, indexPivot - 1);
			quickSort(v, indexPivot + 1, fim);
		}
	}
	
	public static int particionamento(int[] v, int ini, int fim) {
		int pivot = v[ini];
		int i = ini;
		
		for(int j = ini + 1; j <= fim; j++) {
			if(v[j] <= pivot) {
				i++;
				swap(v, i, j);
			}
		}
		swap(v, ini, i);
		return i;
	}
	
	public static String saida(int[] v) {
		String saida = Integer.toString(v[0]);
		for(int i = 1; i < v.length; i++) {
			saida += " " + Integer.toString(v[i]);
		}
		return saida;
	}
	
	private static void swap(int[] nums, int k, int i) {
		int aux = nums[k];
		nums[k] = nums[i];
		nums[i] = aux;
	}
}
