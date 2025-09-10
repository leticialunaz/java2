package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class KthFinder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		int k = sc.nextInt();
		
		String[] arrayNums = numsString.split(" ");
		int[] v = new int[arrayNums.length];
		
		for(int i = 0; i < arrayNums.length; i++) 
			v[i] = Integer.parseInt(arrayNums[i]);
		
		
		heapSortInvertido(v);
		
		
	}
	
	
	
	public static void heapSort(int[] v) {
		Heap heap = new Heap(v.length);
		
		for(int i = 0; i < v.length; i++) {
			heap.add(v[i]);
		}
		
		
		heap.heapSort();
		System.out.println(heap.toString());
		
		
	}
	
	public static void heapSortInvertido(int[] v) {
		Heap heap = new Heap(v.length);
		
		for(int i = 0; i < v.length; i++) {
			heap.add(v[i]);
		}
		
		
		int[] sorted = heap.heapSortInvertido();
		System.out.println(Arrays.toString(sorted));
		
		
	}
	
	
	public static int kesimo(int[] v, int k) {
		Heap heap = new Heap(v.length);
		
		for(int i = 0; i < v.length; i++) 
			heap.add(v[i]);
		
		int result = -1;
	    for (int i = 0; i < k; i++) {
	        result = heap.remove();
	    }
	    
	    return result;
	}

}
class Heap {
    
    private int[] heap;
    private int tail;
    
    public Heap(int capacidade) {
        this.heap = new int[capacidade];
        this.tail = -1;
    }
    
    public void heapSort() {
    	
    	while(tail >= 0) {
    		remove();
    	}
		
	}
    
    public int[] heapSortInvertido() {
    	int n = tail + 1;
    	
    	int[] heap = new int[tail + 1];
    	
    	for(int i = 0; i < n; i++) {
    		heap[i] = this.remove();
    	}
    	
    	return heap;
		
	}

	public Heap(int[] v) {
        this.heap = v;
        this.tail = v.length - 1;
        buildHeap();
    }

    public boolean isEmpty() {
        return this.tail == -1;
    }

    public int left(int i) {
        return 2*i+1;
    }

    public int right(int i) {
        return (i+1)*2;
    }

    public int parent(int i) {
        return Math.floorDiv(i-1, 2);
    }
    
    public void buildHeap() {
        for (int i = parent(this.tail); i >= 0; i--) {
            heapify(i);
        }
    }

    public void add(int n) {
        if (tail >= (heap.length - 1))
            resize();
    
        this.tail += 1;
        this.heap[tail] = n;
        
        int i = tail;
        while (i > 0 && this.heap[parent(i)] < this.heap[i]) {
            int aux = this.heap[i];
            this.heap[i] = this.heap[parent(i)];
            this.heap[parent(i)] = aux;
            i = parent(i);
        }
    }
    
    //TODO implementar
    public int remove() {
       if(isEmpty()) throw new IllegalArgumentException("heap vazio");
       
       
       int element = this.heap[0];
       swap(tail, 0);
       tail--;
       heapify(0);
       
       return element;
       
    }
        
    private void heapify(int index) {
        if (isLeaf(index) || !isValidIndex(index)) 
            return;
        
        // compares index, left and right to find max
        int index_max = max_index(index, left(index), right(index));
        
        // if current index is not greater than its children, 
        // swap and keep heapifying.
        if (index_max != index) {
                swap(index, index_max);
                heapify(index_max);
        }
    } 
    
    private int max_index(int index, int left, int right) {
        if (this.heap[index] > this.heap[left]) {
            if (isValidIndex(right)) {
                if (this.heap[index] < this.heap[right])
                    return right;
            }
            return index;
        
        } else {
            if (isValidIndex(right)) {
                if (this.heap[left] < this.heap[right])
                    return right;
            } 
            
            return left;
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index <= tail;
    }
    
    private boolean isLeaf(int index) {
        return index > parent(tail) && index <= tail; 
    } 
    
    private void swap(int i, int j) {
        int aux = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = aux;
    }

    private void resize() {
        int[] novoHeap = new int[this.heap.length * 2];
        for (int i = 0; i <= tail; i++)
            novoHeap[i] = this.heap[i];
        
        this.heap = novoHeap;
    }
    
    public int size() {
        return this.tail + 1;
    }
    
    public String toString() {
        return Arrays.toString(this.heap);
    }

}
