package polimorfismo.seleccionfutbol2;

import java.io.Serializable;

public abstract class SeleccionFutbol implements Serializable {
	
	private int id;
	private String nombre,apellido;
	private double peso;
	private int edad;
	
	public SeleccionFutbol(int id, String nombre, String apellido, double peso, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.edad = edad;
	}

	public int getId() {
		return id;
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

	public int getEdad() {
		return edad;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	

}
