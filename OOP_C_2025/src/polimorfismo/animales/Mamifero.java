package polimorfismo.animales;

public class Mamifero extends Animal{
	
	private String alimentacion;

	public Mamifero(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion) {
		super(nombre, peso, edad, sexo, habitat);
		this.alimentacion = alimentacion;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	

}
