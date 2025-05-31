package polimorfismo.animal;

public class Lobo extends Canino{
	
	private String origen;

	public Lobo(String nombre, double peso, int edad, String habitat, String alimento, String raza, String tamaño,
			String origen) {
		super(nombre, peso, edad, habitat, alimento, raza, tamaño);
		this.origen = origen;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	

}
