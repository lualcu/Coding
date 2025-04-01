package composicion.evaluacion;

public class Ciclista {
	
	private String nombre, apellido, equipo, email, patrocinador;
	private int edad, numero;
	private double salario;
	
	public Ciclista(String nombre, String apellido, String equipo, String email, String patrocinador, int edad,
			int numero, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = equipo;
		this.email = email;
		this.patrocinador = patrocinador;
		this.edad = edad;
		this.numero = numero;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEquipo() {
		return equipo;
	}

	public String getEmail() {
		return email;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public int getEdad() {
		return edad;
	}

	public int getNumero() {
		return numero;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	

}
