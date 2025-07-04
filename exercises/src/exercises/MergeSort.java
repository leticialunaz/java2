package exercises;

import java.util.Arrays;
import java.util.Scanner;

class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		String[] array = entrada.split(" ");
		
		int[] nums = new int[array.length];
		for (int i = 0; i < nums.length; i++) 
			nums[i] = Integer.parseInt(array[i]);	
		

		mergeSort(nums, 0, nums.length - 1);
	}
		
	
		
	public static void mergeSort(int[] v, int ini, int fim) {
        System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));

		if(ini < fim) {
			int meio = (ini + fim)/2;
		

			mergeSort(v, ini, meio);
			mergeSort(v, meio + 1, fim);
		
			merge(v, ini, meio, fim);

			
	        System.out.println(Arrays.toString(Arrays.copyOfRange(v, ini, fim + 1)));

		}
	}



	private static void merge(int[] v, int ini, int meio, int fim) {
		int[] helper = new int[v.length];
		for(int l = 0; l <= fim; l++)
			helper[l] = v[l];
		
		int i = ini;
		int j = meio + 1;
		int k = ini;
		
		while((i <= meio) && (j <= fim)) {
			if(helper[i] < helper[j])
				v[k++] = helper[i++];
			else
				v[k++] = helper[j++];
		}
		
		while(i <= meio) {
			v[k++] = helper[i++];
		}
	}
	
	
}