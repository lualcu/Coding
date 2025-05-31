package herencia.persona;

public class Maestro extends Persona{
	
	private String grado;
	private double salario;
	
	public Maestro(String nombre, String apellido, String edad, 
			String sexo, String grado, double salario) {
		super(nombre, apellido, edad, sexo);
		this.grado = grado;
		this.salario = salario;
	}
	
	public Maestro() {}

	public String getGrado() {
		return grado;
	}

	public double getSalario() {
		return salario;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
