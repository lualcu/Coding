package composicion.evaluacion;

public class Terapeuta {

	private String nombre, email, direccion;
	private int edad;
	private double salario;
	
	public Terapeuta(String nombre, String email, String direccion, int edad, double salario) {
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}
