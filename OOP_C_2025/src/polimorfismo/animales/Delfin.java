package polimorfismo.animales;

public class Delfin extends Mamifero{
	
	private String colorPiel,region;

	public Delfin(String nombre, double peso, int edad, String sexo, String habitat, String alimentacion,
			String colorPiel, String region) {
		super(nombre, peso, edad, sexo, habitat, alimentacion);
		this.colorPiel = colorPiel;
		this.region = region;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public String getRegion() {
		return region;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
