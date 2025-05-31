package polimorfismo.seleccionfutbol2;

public class Entrenador extends SeleccionFutbol {
	
	private String idFederacion;
	private String campeonatos;
	private int equipos;
	private int auxiliares;
	
	public Entrenador(int id, String nombre, String apellido, double peso, int edad, String idFederacion,
			String campeonatos, int equipos, int auxiliares) {
		super(id, nombre, apellido, peso, edad);
		this.idFederacion = idFederacion;
		this.campeonatos = campeonatos;
		this.equipos = equipos;
		this.auxiliares = auxiliares;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public String getCampeonatos() {
		return campeonatos;
	}

	public int getEquipos() {
		return equipos;
	}

	public int getAuxiliares() {
		return auxiliares;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void setCampeonatos(String campeonatos) {
		this.campeonatos = campeonatos;
	}

	public void setEquipos(int equipos) {
		this.equipos = equipos;
	}

	public void setAuxiliares(int auxiliares) {
		this.auxiliares = auxiliares;
	}
	
	
	

}
