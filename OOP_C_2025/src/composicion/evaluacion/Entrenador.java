package composicion.evaluacion;

public class Entrenador {
	
	private String nombre, apellido, sexo, email, direccion, equipo;
	private int edad, telefono;
	private double salario;
	
	public Entrenador(String nombre, String apellido, String sexo, String email, String direccion, String equipo,
			int edad, int telefono, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.email = email;
		this.direccion = direccion;
		this.equipo = equipo;
		this.edad = edad;
		this.telefono = telefono;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEquipo() {
		return equipo;
	}

	public int getEdad() {
		return edad;
	}

	public int getTelefono() {
		return telefono;
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

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
