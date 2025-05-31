package herencia.vehiculo2;

import java.io.*;

public class Terrestre extends Vehiculo implements Serializable {

	private String tipo;

	public Terrestre(String nombre, String marca, String color, int modelo, double precio, double velocidad,
			String tipo) {
		super(nombre, marca, color, modelo, precio, velocidad);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
