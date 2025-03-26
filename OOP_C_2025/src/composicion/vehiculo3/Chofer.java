package composicion.vehiculo3;

public class Chofer {
	// Definicion de los Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private int edad;
	private double salario;
	
	// Definicion del Metodo Constructor
	public Chofer() {
		
	}
	public Chofer(String nombre, String apellido, String direccion, String email, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.edad = edad;
		this.salario = salario;
	}
	
	// Definicion de los metodos get's
	
	public String getnNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getEmail() {
		return this.email;
	}
	public int getEdad() {
		return this.edad;
	}
	public double getSalario() {
		return this.salario;
	}
	
	// Definicion de los Metodos Set's
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
}
