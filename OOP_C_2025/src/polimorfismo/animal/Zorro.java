package polimorfismo.animal;

public class Zorro extends Canino{
	
	private String longevidad;

	public Zorro(String nombre, double peso, int edad, String habitat, String alimento, String raza, String tamaño,
			String longevidad) {
		super(nombre, peso, edad, habitat, alimento, raza, tamaño);
		this.longevidad = longevidad;
	}

	public String getLongevidad() {
		return longevidad;
	}

	public void setLongevidad(String longevidad) {
		this.longevidad = longevidad;
	}
	
	

}
