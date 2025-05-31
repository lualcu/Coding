package polimorfismo.seleccionfutbol2;

public class Masajista extends SeleccionFutbol{
	
	private String especialidad;
	private int experiencia;
	private String email;
	private String telefono;
	
	public Masajista(int id, String nombre, String apellido, double peso, int edad, String especialidad,
			int experiencia, String email, String telefono) {
		super(id, nombre, apellido, peso, edad);
		this.especialidad = especialidad;
		this.experiencia = experiencia;
		this.email = email;
		this.telefono = telefono;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
