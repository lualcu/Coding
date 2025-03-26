package composicion.pokemon2;

public class Pokemon {
	// Definicion de los Atributos de la Clase
	private String nombre;
	private String especie;
	private String tipo;
	private String habitat;
	private double peso;
	private double altura;
	
	
	// Definicion del Metodo Constructor
	
	public Pokemon(String nombre, 
				   String especie, 
				   String tipo, 
				   double peso, 
				   double altura, 
				   String habitat) {
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
		this.peso = peso;
		this.altura = altura;
		this.habitat = habitat;
	}
	// Metodos Get's
	public String getNombre() {
		return this.nombre;
	}
	public String getEspecie() {
		return this.especie;
	}
	public String getTipo() {
		return this.tipo;
	}
	public String getHabitat() {
		return this.habitat;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getAltura() {
		return this.altura;
	}
	// Metodos Set's
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
		
}
