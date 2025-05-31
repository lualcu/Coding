package herencia.seleccionfutbol;
import java.io.Serializable;

public class Masajista extends SeleccionFutbol implements Serializable{
	
	private String especialidad;
	private int experiencia;
	
	public Masajista(int id, int edad, String nombre, String apellido, double peso, String especialidad,
			int experiencia) {
		super(id, edad, nombre, apellido, peso);
		this.especialidad = especialidad;
		this.experiencia = experiencia;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	

}
