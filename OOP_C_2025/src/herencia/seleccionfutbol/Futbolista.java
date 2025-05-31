package herencia.seleccionfutbol;
import java.io.Serializable;

public class Futbolista extends SeleccionFutbol implements Serializable {
	
	private String posicion;
	private int numero;
	
	public Futbolista(int id, int edad, String nombre, String apellido, double peso, String posicion, int numero) {
		super(id, edad, nombre, apellido, peso);
		this.posicion = posicion;
		this.numero = numero;
	}

	public String getPosicion() {
		return posicion;
	}

	public int getNumero() {
		return numero;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
