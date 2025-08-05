package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TabelaHashChaining {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tamanho = sc.nextInt();
		
		TabelaHash tabelaHash = new TabelaHash(tamanho);
		
		boolean fim = false;
		while(!fim) {
			String[] comando = sc.nextLine().split(" ");
			if(comando[0].equals("end"))  fim = true; 
			if(comando[0].equals("put")) put(tabelaHash, comando[1], comando[2]);
			if(comando[0].equals("remove")) remove(tabelaHash, comando[1]);
			if(comando[0].equals("keys")) keysSort(tabelaHash);
			if(comando[0].equals("values")) valuesSort(tabelaHash); 
		}
		
		
		
		
	}

	private static void valuesSort(TabelaHash tabelaHash) {
		List<String> values = tabelaHash.values();
		Collections.sort(values);
		System.out.println(values);		
	}

	private static void keysSort(TabelaHash tabelaHash) {
		List<Integer> keys = tabelaHash.keys();
		Collections.sort(keys);
		System.out.println(keys);
		
	}



	private static void remove(TabelaHash tabelaHash, String string) {
		int key = Integer.parseInt(string);
		tabelaHash.remove(key);
		System.out.println(tabelaHash.toString());
		
	}

	private static void put(TabelaHash tabelaHash, String string, String nome) {
		int key = Integer.parseInt(string);
		tabelaHash.put(key, nome);
		System.out.println(tabelaHash.toString());
	}
}

class TabelaHash{
    private ArrayList<Pair>[] tabela;
	
	public TabelaHash(int tamanho) {
		 tabela = new ArrayList[tamanho];
	        for (int i = 0; i < tamanho; i++) {
	            tabela[i] = new ArrayList<>();
	        }	
	        
	}
	
	public int hash(int key) {
		return key % tabela.length;
	}
	
	public void put(int key, String value) {
		int index = hash(key);
        ArrayList<Pair> lista = tabela[index];

        for (Pair p : lista) {
            if (p.getKey() == key) {
                p.value = value;
                return;
            }
        }

        lista.add(new Pair(key, value));
	    
	}
	
	public void remove(int key) {
		int index = hash(key);
        ArrayList<Pair> lista = tabela[index];
	    if (lista == null || lista.isEmpty()) {
	    	return;
	    } else {
	    	lista.remove(index);
	    }
	}
	
    public List<Integer> keys() {
        List<Integer> todasAsChaves = new ArrayList<>();
        for (ArrayList<Pair> lista : tabela) {
            for (Pair p : lista) {
                todasAsChaves.add(p.getKey());
            }
        }
        return todasAsChaves;
    }

    public List<String> values() {
        List<String> todosOsValores = new ArrayList<>();
        for (ArrayList<Pair> lista : tabela) {
            for (Pair p : lista) {
                todosOsValores.add(p.getValue());
            }
        }
        return todosOsValores;
    }
	
	public String toString() {
	    String resultado = "[";
	    for (int i = 0; i < tabela.length; i++) {
	        resultado += tabela[i];
	        if (i < tabela.length - 1) {
	            resultado += ", ";
	        }
	    }
		resultado += "]";
		return resultado;

	}
	
}

class Pair {
	int key;
	String value;
	
	public Pair(int key, String value) {
		this.key = key;
		this.value = value;
	}
	


	public int getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}
	
	public Pair getPair(int key) {
		return this;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pair)) return false;
        Pair other = (Pair) obj;
        return this.key == other.key;
    }
	
	public String toString() {
		return "<" + key + ", " + value + ">";
		
	}
}


