package polimorfismo.animales;

public class Perro extends Mamifero{
	
	private String colorPelo,raza;

	public Perro(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion,
			String colorPelo, String raza) {
		super(nombre, peso, edad, sexo, habitat, alimentacion);
		this.colorPelo = colorPelo;
		this.raza = raza;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public String getRaza() {
		return raza;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
