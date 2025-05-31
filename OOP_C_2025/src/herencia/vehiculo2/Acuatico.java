package herencia.vehiculo2;

import java.io.*;

public class Acuatico extends Vehiculo implements Serializable {
	
	private String empresa,ruta;

	public Acuatico(String nombre, String marca, String color, int modelo, double precio, double velocidad,
			String empresa, String ruta) {
		super(nombre, marca, color, modelo, precio, velocidad);
		this.empresa = empresa;
		this.ruta = ruta;
	}

	public String getEmpresa() {
		return empresa;
	}

	public String getRuta() {
		return ruta;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	

}
