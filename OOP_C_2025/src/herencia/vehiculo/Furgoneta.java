package herencia.vehiculo;

public class Furgoneta extends Vehiculo{
	
	private int carga;
	private int volumen;
	
	// Definicion del Metodo Constructor
	
	public Furgoneta(String matricula, String marca, String modelo, String color, double precio, int carga,
			int volumen) {
		super(matricula, marca, modelo, color, precio);
		this.carga = carga;
		this.volumen = volumen;
	}
	
	public Furgoneta() {}
	
	// Definicion de Metodos get's & set's

	public int getCarga() {
		return carga;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	
	
	
	
	

}
