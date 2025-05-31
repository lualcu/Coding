package herencia.empleado;

import java.io.Serializable;

public class Director extends Empleado implements Serializable{
	
	private double bono;

	public Director(int id, String nombre, String apaterno, String amaterno, int edad, String sexo, String direccion,
			double salario, double bono) {
		super(id, nombre, apaterno, amaterno, edad, sexo, direccion, salario);
		this.bono = bono;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}
	
	

}
