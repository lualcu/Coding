package composicion.hotel;

public class Hotel {
	
	private Huesped huesped;
	private Habitacion habitacion;
	
	private String nombre,direccion,telefono,www,rfc,categoria,ciudad;

	public Hotel(Huesped huesped, Habitacion habitacion, String nombre, String direccion, String telefono, String www,
			String rfc, String categoria, String ciudad) {
		this.huesped = huesped;
		this.habitacion = habitacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.www = www;
		this.rfc = rfc;
		this.categoria = categoria;
		this.ciudad = ciudad;
	}

	public Huesped getHuesped() {
		return huesped;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getWww() {
		return www;
	}

	public String getRfc() {
		return rfc;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setHuesped(Huesped huesped) {
		this.huesped = huesped;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
