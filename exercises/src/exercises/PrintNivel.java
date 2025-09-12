package exercises;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class PrintNivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numsString = sc.nextLine();
		int nivel = sc.nextInt();
		
		String[] arrayNums = numsString.split(", ");
		BST bst = new BST();
		
		for(int i = 0; i < arrayNums.length; i++) 
			bst.add(Integer.parseInt(arrayNums[i]));
	
		System.out.println(bst.printNivel(nivel));
		
	}
}



//class BST {
    private Node root;
    
    
    public String printNivel(int nivel) {
    	Deque<Node> bfs = new LinkedList<Node>();
		
		String saida ="";
		
		if(isEmpty()) return saida;
		
		
		bfs.addLast(this.root);
		
		while(!bfs.isEmpty()) {
			Node current = bfs.removeFirst();
			
			
			
			if(current.left != null) bfs.addLast(current.left);
			if(current.right != null) bfs.addLast(current.right);
			
			if(descobreNivel(current) == nivel)
				saida += current.value + " ";
		}
	
		
		
		return saida;
		
    }

    public boolean isEmpty() {
    	return this.root == null;
    }
    



	public int descobreNivel(Node node) {
		if(node == null) return -1;
		
		return descobreNivel(this.root, node);
	
	}
	
	private int descobreNivel(Node current, Node toSearch) {
		if(current == null || current.value == toSearch.value) return 0;
		
		if(toSearch.value < current.value) {
			return 1 + descobreNivel(current.left, toSearch);
		} else {
			return 1 + descobreNivel(current.right, toSearch);
		}
		
		
	}

	public void add(int element) {
		Node toAdd = new Node(element);
		
		if(isEmpty()) {
			this.root = toAdd;
			return;
		}
		
		Node aux = this.root;
		
		while(aux != null) {
			if(toAdd.value > aux.value) {
				if(aux.right == null) {
					aux.right = toAdd;
					toAdd.parent = aux;
					return;
				} else {
					aux = aux.right;
				}
			} else {
				if(aux.left == null) {
					aux.left = toAdd;
					toAdd.parent = aux;
					return;
				} else {
					aux = aux.left;
				}
			}
		}	
		
	}
}



//class Node {
    int value;
    Node left;
    Node right;
    Node parent;


    public Node(int v) {
    	this.value = v;
    }


    public boolean isLeaf() {
    	return this.left == null && this.right == null;
    }

}
