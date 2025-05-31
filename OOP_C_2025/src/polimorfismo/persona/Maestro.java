package polimorfismo.persona;

public class Maestro extends Persona{
	private String grado;
	private double salario;
	private String direccion;
	private String telefono;
	
	public Maestro(String nombre, String nacionalidad, int edad, String sexo, String grado, double salario,
			String direccion, String telefono) {
		super(nombre, nacionalidad, edad, sexo);
		this.grado = grado;
		this.salario = salario;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getGrado() {
		return grado;
	}

	public double getSalario() {
		return salario;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
