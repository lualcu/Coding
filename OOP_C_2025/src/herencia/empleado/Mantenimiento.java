package herencia.empleado;

import java.io.Serializable;

public class Mantenimiento extends Empleado implements Serializable{
	
	private String area;

	public Mantenimiento(int id, String nombre, String apaterno, String amaterno, int edad, String sexo,
			String direccion, double salario, String area) {
		super(id, nombre, apaterno, amaterno, edad, sexo, direccion, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
