package herencia.empleado;

import java.io.Serializable;

public class Informatico extends Empleado implements Serializable {
	
	private String correo;
	private int telefono;
	public Informatico(int id, String nombre, String apaterno, String
			amaterno, int edad, String sexo, String direccion,
			double salario, String correo, int telefono) {
		super(id, nombre, apaterno, amaterno, edad, sexo, direccion, salario);
		this.correo = correo;
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
