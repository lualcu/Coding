package composicion.pokemon3;

public class Gimnasio {
	private String nombre, lugar, propietario, superficie;
	private int capacidad;
	
	public Gimnasio(String nombre, String lugar, String propietario, String superficie, int capacidad) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.propietario = propietario;
		this.superficie = superficie;
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public String getPropietario() {
		return propietario;
	}

	public String getSuperficie() {
		return superficie;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
}
