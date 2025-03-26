package composicion.paciente;

public class Medico {
	// Definicion de los Atributos de la Clase
	private String name;
	private String apellido;
	private String direccion;
	private String email;
	private int edad;
	private double salario;
	private int cedula;
	private String especialidad;
	
	public Medico(String name, String apellido, String direccion, String email, int edad, double salario, int cedula,
			String especialidad) {
		this.name = name;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.edad = edad;
		this.salario = salario;
		this.cedula = cedula;
		this.especialidad = especialidad;
	}
	
	public Medico() {
		
	}

	public String getName() {
		return name;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public int getCedula() {
		return cedula;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
	

}
