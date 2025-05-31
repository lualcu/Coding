package herencia.persona;

public class Directivo extends Persona{
	
	private String puesto, departamento;

	public Directivo(String nombre, String apellido, String edad, 
			String sexo, String puesto, String departamento) {
		super(nombre, apellido, edad, sexo);
		this.puesto = puesto;
		this.departamento = departamento;
	}
	
	public Directivo() {}

	public String getPuesto() {
		return puesto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
