package polimorfismo.animales;

public class Oviparo extends Animal{
	
	private String tamaño,especie;

	public Oviparo(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String especie) {
		super(nombre, peso, edad, sexo, habitat);
		this.tamaño = tamaño;
		this.especie = especie;
	}

	public String getTamaño() {
		return tamaño;
	}

	public String getEspecie() {
		return especie;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	

}
