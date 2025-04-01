package composicion.pokemon3;

public class Pokemon {
	
	private Gimnasio gimnasio;
	private Entrenador entrenador;
	private String nombre, tipo, poder, habitat, especie, evolucion;
	private double peso, altura;
	
	public Pokemon(Gimnasio gimnasio, Entrenador entrenador, String nombre, String tipo, String poder, String habitat,
			String especie, String evolucion, double peso, double altura) {
		this.gimnasio = gimnasio;
		this.entrenador = entrenador;
		this.nombre = nombre;
		this.tipo = tipo;
		this.poder = poder;
		this.habitat = habitat;
		this.especie = especie;
		this.evolucion = evolucion;
		this.peso = peso;
		this.altura = altura;
	}

	public Gimnasio getGimnasio() {
		return gimnasio;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public String getPoder() {
		return poder;
	}

	public String getHabitat() {
		return habitat;
	}

	public String getEspecie() {
		return especie;
	}

	public String getEvolucion() {
		return evolucion;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setGimnasio(Gimnasio gimnasio) {
		this.gimnasio = gimnasio;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setEvolucion(String evolucion) {
		this.evolucion = evolucion;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	

}
