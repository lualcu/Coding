package polimorfismo.persona;

public abstract class Persona {
	
	private String nombre,nacionalidad;
	private int edad;
	private String sexo;
	public Persona(String nombre, String nacionalidad, int edad, String sexo) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
