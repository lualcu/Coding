package herencia.animal;
import java.io.Serializable;

public class Animal implements Serializable{
	
	private String nombre;
	private double peso;
	private int edad;
	
	public Animal(String nombre, double peso, int edad) {
		
		this.nombre = nombre;
		this.peso = peso;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
