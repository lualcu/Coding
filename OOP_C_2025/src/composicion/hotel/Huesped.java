package composicion.hotel;

public class Huesped {
	
	private String nombre,apellido,direccion,email,origen;
	private int edad;
	private long telefono;
	
	public Huesped(String nombre, String apellido, String direccion, String email, String origen, int edad,
			long telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.origen = origen;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
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

	public String getOrigen() {
		return origen;
	}

	public int getEdad() {
		return edad;
	}

	public long getTelefono() {
		return telefono;
	}

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

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

}
