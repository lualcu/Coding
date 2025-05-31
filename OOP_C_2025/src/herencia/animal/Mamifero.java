package herencia.animal;
import java.io.Serializable;

public class Mamifero extends Animal implements Serializable{
	
	private String alimento;

	public Mamifero(String nombre, double peso, int edad, String alimento) {
		super(nombre, peso, edad);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	

}
