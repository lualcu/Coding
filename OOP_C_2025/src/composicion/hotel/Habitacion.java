package composicion.hotel;

public class Habitacion {
	private int numero, capacidad;
	private String piso,categoria;
	
	public Habitacion(int numero, int capacidad, String piso, String categoria) {
		this.numero = numero;
		this.capacidad = capacidad;
		this.piso = piso;
		this.categoria = categoria;
	}

	public int getNumero() {
		return numero;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getPiso() {
		return piso;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
