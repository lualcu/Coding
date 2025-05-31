package herencia.persona;

public class Estudiante extends Persona {
	
	private String escuela;
	private double promedio;
	
	public Estudiante(String nombre, String apellido, String edad,
			String sexo, String escuela, double promedio) {
		super(nombre, apellido, edad, sexo);
		this.escuela = escuela;
		this.promedio = promedio;
	}

	public Estudiante() {
	}

	public String getEscuela() {
		return escuela;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	
	
	
	
	

}
