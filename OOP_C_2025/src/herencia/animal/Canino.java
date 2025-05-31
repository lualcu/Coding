package herencia.animal;
import java.io.Serializable;
public class Canino extends Mamifero implements Serializable{

	private String habitat;

	public Canino(String nombre, double peso, int edad, String alimento, String habitat) {
		super(nombre, peso, edad, alimento);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
