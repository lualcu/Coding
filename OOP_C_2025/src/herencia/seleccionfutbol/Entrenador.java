package herencia.seleccionfutbol;

import java.io.Serializable;

public class Entrenador extends SeleccionFutbol implements Serializable{
	
	private String idFederacion;

	public Entrenador(int id, int edad, String nombre, String apellido, double peso, String idFederacion) {
		super(id, edad, nombre, apellido, peso);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	

}
