package herencia.vehiculo2;

import java.io.Serializable;

public class Aereo extends Vehiculo implements Serializable{
	
	private String categoria;
	private int capacidad;
	public Aereo(String nombre, String marca, String color, int modelo, double precio, double velocidad,
			String categoria, int capacidad) {
		super(nombre, marca, color, modelo, precio, velocidad);
		this.categoria = categoria;
		this.capacidad = capacidad;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	

}
