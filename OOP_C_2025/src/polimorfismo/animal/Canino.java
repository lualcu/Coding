package polimorfismo.animal;

public class Canino extends Mamifero{
	
	private String tamaño;

	public Canino(String nombre, double peso, int edad, String habitat, String alimento, String raza, String tamaño) {
		super(nombre, peso, edad, habitat, alimento, raza);
		this.tamaño = tamaño;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	
	

}
