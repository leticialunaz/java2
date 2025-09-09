package exercises;

import java.util.Scanner;

class MaxHeap {
	
	int[] heap;
	int tail;
	
	public MaxHeap(int tamanho) {
		this.heap = new int[tamanho];
		this.tail = -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		
		String[] arrayNums = numsString.split(" ");
		MaxHeap heap = new MaxHeap(arrayNums.length);
		
		for(int i = 0; i < arrayNums.length; i++) 
			heap.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(heap.isHeap());
		
	}
	
	public boolean isHeap() {
		for(int i = tail; i >= 0; i--) {
			if(heap[i] > heap[parent(i)])
				return false;
		}
		return true;
	}
	
	
	public void add(int key) {
		this.heap[++tail] = key;
	}
	
	
	public int right(int index) {
		return 2*index + 2;
	}
	
	public int left(int index) {
		return 2*index + 1;
	}
	
	public int parent(int index) {
		return (index - 1)/2;
	}
}
