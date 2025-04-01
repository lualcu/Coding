package composicion.pokemon3;

public class Entrenador {
	
	private String nombre, apellido, sexo;
	private int edad, telefono, numPokemons, numMedallas;
	
	public Entrenador(String nombre, String apellido, String sexo, int edad, int telefono, int numPokemons,
			int numMedallas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.telefono = telefono;
		this.numPokemons = numPokemons;
		this.numMedallas = numMedallas;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	public int getTelefono() {
		return telefono;
	}

	public int getNumPokemons() {
		return numPokemons;
	}

	public int getNumMedallas() {
		return numMedallas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public void setNumPokemons(int numPokemons) {
		this.numPokemons = numPokemons;
	}

	public void setNumMedallas(int numMedallas) {
		this.numMedallas = numMedallas;
	}
	
	
	
	
	
	

}
