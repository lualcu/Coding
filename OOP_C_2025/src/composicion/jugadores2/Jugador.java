package composicion.jugadores2;

public class Jugador {
	private String nombre;
	private String apellido;
	private String correo;
	private String equipo;
	private double salario;
	private String posicion;
	private int edad;
	private String nacionalidad;
	private int numeral;
	
	public Jugador(String nombre,
				   String apellido,
				   String correo,
				   String equipo,
				   double salario,
				   String posicion,
				   int edad,
				   String nacionalidad,
				   int numeral) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.equipo = equipo;
		this.salario = salario;
		this.posicion = posicion;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.numeral = numeral;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getCorreo() {
		return this.correo;
	}
	public String getEquipo() {
		return this.equipo;
	}
	public String getPosicion() {
		return this.posicion;
	}
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	public double getSalario() {
		return this.salario;
	}
	public int getEdad() {
		return this.edad;
	}
	public int getNumeral() {
		return this.numeral;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNumeral(int numeral) {
		this.numeral = numeral;
	}

}
