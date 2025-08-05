package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FuraFila {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entrada = sc.nextLine();
		int index = sc.nextInt();
		
		String[] array = entrada.split(" ");
		
		int[] fila = new int[array.length];
		for (int i = 0; i < fila.length; i++) {
            fila[i] = Integer.parseInt(array[i]);
		}
		
		furaFila(index, fila);
	}

	private static void furaFila(int index, int[] fila) {
		int numIdosos = fila.length - index;
		
		for(int i = 0; i < numIdosos; i++) {
			int pos = index + i;
			int idoso = fila[pos];
			
			for(int j = pos; j > i; j--) {
				fila[j] = fila[j - 1];
			}
			
			fila[i] = idoso;
			
			System.out.println(Arrays.toString(fila));
		}
	}
}

