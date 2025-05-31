package polimorfismo.animales;

public class Tortuga extends Oviparo{
	
	private int longevidad;

	public Tortuga(String nombre, double peso, int edad, String sexo, String habitat, String tamaño, String especie,
			int longevidad) {
		super(nombre, peso, edad, sexo, habitat, tamaño, especie);
		this.longevidad = longevidad;
	}

	public int getLongevidad() {
		return longevidad;
	}

	public void setLongevidad(int longevidad) {
		this.longevidad = longevidad;
	}
	
	
}
