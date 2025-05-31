package polimorfismo.persona;

public class Estudiante extends Persona{
	
	private String escuela;
	private double promedio;
	private String email;
	
	public Estudiante(String nombre, String nacionalidad, int edad, String sexo, String escuela, double promedio,
			String email) {
		super(nombre, nacionalidad, edad, sexo);
		this.escuela = escuela;
		this.promedio = promedio;
		this.email = email;
	}

	public String getEscuela() {
		return escuela;
	}

	public double getPromedio() {
		return promedio;
	}

	public String getEmail() {
		return email;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
