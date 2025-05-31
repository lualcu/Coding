package polimorfismo.animal;

public class Mamifero extends Animal{
	
	private String alimento,raza;

	public Mamifero(String nombre, double peso, int edad, String habitat, String alimento, String raza) {
		super(nombre, peso, edad, habitat);
		this.alimento = alimento;
		this.raza = raza;
	}

	public String getAlimento() {
		return alimento;
	}

	public String getRaza() {
		return raza;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
