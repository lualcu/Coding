package polimorfismo.animales;

public class Aguila extends Oviparo {
	
	private String garras,vista;

	public Aguila(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String especie,
			String garras, String vista) {
		super(nombre, peso, edad, sexo, habitat, tamaño, especie);
		this.garras = garras;
		this.vista = vista;
	}

	public String getGarras() {
		return garras;
	}

	public String getVista() {
		return vista;
	}

	public void setGarras(String garras) {
		this.garras = garras;
	}

	public void setVista(String vista) {
		this.vista = vista;
	}
	
	

}
