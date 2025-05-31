package polimorfismo.seleccionfutbol;

import javax.swing.JOptionPane;

public abstract class SeleccionFutbol {
	
	private int id,edad;
	private String nombre,apellidos;
	public SeleccionFutbol(int id, int edad, String nombre, String apellidos) {
		super();
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	public String getApellidos() {
		return apellidos;
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
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void viajar() {
		System.out.println("Viajar (Clase Padre)");
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse (Clase Padre)");
	}
	
	
	// No se implemente en la clase abstracta pero si en las clases hijas
	public abstract void entrenamiento();
	
	public void partidoFutbol() {
		System.out.println("Asiste al Partido de Fútbol (Clase Padre)");
	}
	
	
	

}
