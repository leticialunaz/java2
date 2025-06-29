package minicarregadeiras;

import java.util.ArrayList;

public class MinicarregadeiraController {

	public ArrayList<MiniCarregadeira> minicarregadeiras;
	private int controlador;
	
	public MinicarregadeiraController() {
		this.minicarregadeiras = new ArrayList<>();
		this.controlador = 0;
	}
	
	public int cadastrarMiniCar(double potencia, double capacidade, double peso) {
		if (potencia < 0 || capacidade < 0 || peso < 0) {
			throw new IllegalArgumentException("Algum dos parâmetros está inválido");
		}
		
		MiniCarregadeira mc = new MiniCarregadeira(potencia, capacidade, peso);
		this.minicarregadeiras.add(mc);
		controlador++;
		mc.setId(controlador);
		return mc.getId();
	}
	
	
	public String exibirMiniCar(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("Identificador inválido");
		}
		return this.minicarregadeiras.get(id).toString();
	}
	
	public String consultar(String aplicacao) {
		
	}
}
