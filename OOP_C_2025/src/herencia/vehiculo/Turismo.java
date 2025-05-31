package herencia.vehiculo;

public class Turismo extends Vehiculo{
	
	private int puertas;
	private String transmisión;

	// Definicion del Metodo Constructor
	
	public Turismo(String matricula, String marca, String modelo, String color, double precio, int puertas,
			String transmisión) {
		super(matricula, marca, modelo, color, precio);
		this.puertas = puertas;
		this.transmisión = transmisión;
	}
	
	public Turismo() {
	}
	
	// Definicion de los Metodos Get's y Set's
	
	public int getPuertas() {
		return puertas;
	}

	public String getTransmisión() {
		return transmisión;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public void setTransmisión(String transmisión) {
		this.transmisión = transmisión;
	}
	
	
	
	
	
	
	
	

}
