package herencia.seleccionfutbol;

import java.io.Serializable;

public class SeleccionFutbol implements Serializable {
	private int id,edad;
	private String nombre,apellido;
	private double peso;
	
	public SeleccionFutbol(int id, int edad, String nombre, String apellido, double peso) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getPeso() {
		return peso;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	

}
