package herencia.vehiculo;

public class Deportivo extends Vehiculo {
	
	private int cilindros;
	
	// Definicion del Metodo Constructor

	public Deportivo(String matricula, String marca, String modelo, String color, double precio, int cilindros) {
		super(matricula, marca, modelo, color, precio);
		this.cilindros = cilindros;
	}
	
	public Deportivo() {}

	// Definicion de Get's & Set's
	
	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	
	
	
	
	
	

}
