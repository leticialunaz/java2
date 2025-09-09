package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BuildHeap {
	
	int[] heap;
	int tail;
	
	public BuildHeap(int tamanho) {
		this.heap = new int[tamanho];
		this.tail = -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		
		String[] arrayNums = numsString.split(" ");
		BuildHeap heap = new BuildHeap(arrayNums.length);
		
		for(int i = 0; i < arrayNums.length; i++) 
			heap.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(heap.buildHeap());
		
	}
	
	public int parent(int index) {
		return (index-1)/2;
	}
	
	public int right(int index) {
		return 2*index + 2;
	}
	
	
	public int left(int index) {
		return 2*index + 1;
	}
	
	
	public String buildHeap() {
		
		int aux = parent(tail);
		
		for(int i = aux; i >=0; i--) {
			heapify(i);
		}
			
		
		return Arrays.toString(heap);
	}

	private void heapify(int i) {
		if(isLeaf(i) || !isValidIndex(i)) return;
		
		int maxIndex = maxIndex(i, right(i), left(i));
		
		if(maxIndex != i) {
			swap(maxIndex, i);
			heapify(maxIndex);
		}
			
	}

	private int maxIndex(int i, int right, int left) {
		int max = i;
		
		if(isValidIndex(right) && heap[right]> heap[max])
			max = right;
		if(isValidIndex(left) &&heap[left] > heap[max])
			max = left;
		
		return max;
	}

	private boolean isLeaf(int i) {
		return i > parent(tail) && i <= tail;
	}

	private boolean isValidIndex(int i) {
		return i >=0 && i <= tail;
	}

	public void add(int key) {
		this.heap[++tail] = key;
	}

	private void swap(int i, int j) {
		int aux = this.heap[i];
		heap[i] = this.heap[j];
		heap[j] = aux;
	}
}
