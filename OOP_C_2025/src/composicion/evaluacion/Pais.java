package composicion.evaluacion;

public class Pais {
	
	private Terapeuta terapeuta;
	private Ciclista ciclista;
	private Entrenador entrenador;
	
	private String nombre, equipo, ruta, www;
	private int espectadores;
	
	public Pais(Terapeuta terapeuta, Ciclista ciclista, Entrenador entrenador, String nombre, String equipo,
			String ruta, String www, int espectadores) {
		this.terapeuta = terapeuta;
		this.ciclista = ciclista;
		this.entrenador = entrenador;
		this.nombre = nombre;
		this.equipo = equipo;
		this.ruta = ruta;
		this.www = www;
		this.espectadores = espectadores;
	}

	public Terapeuta getTerapeuta() {
		return terapeuta;
	}

	public Ciclista getCiclista() {
		return ciclista;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public String getRuta() {
		return ruta;
	}

	public String getWww() {
		return www;
	}

	public int getEspectadores() {
		return espectadores;
	}

	public void setTerapeuta(Terapeuta terapeuta) {
		this.terapeuta = terapeuta;
	}

	public void setCiclista(Ciclista ciclista) {
		this.ciclista = ciclista;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public void setWww(String www) {
		this.www = www;
	}

	public void setEspectadores(int espectadores) {
		this.espectadores = espectadores;
	}
	
	
	

}
