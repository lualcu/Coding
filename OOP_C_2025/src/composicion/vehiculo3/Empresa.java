package composicion.vehiculo3;

public class Empresa {
	// Definicion de Atributos
	private String nombre;
	private String direccion;
	private String rfc;
	private String www;
	
	// Definicion del Metodo Constructor
	
	public Empresa() {
		
	}
	
	public Empresa(String nombre, String direccion, String rfc, String www) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.rfc = rfc;
		this.www = www;
	}
	
	// Definicion de los Metodos get's
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getRfc() {
		return this.rfc;
	}
	public String getWww() {
		return this.www;
	}
	
	// Definicion de los Metodos set's
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public void setWww(String www) {
		this.www = www;
	}
}
