package polimorfismo.seleccionfutbol;

public class Entrenador extends SeleccionFutbol{
	
	private int idFederacion;

	public Entrenador(int id, int edad, String nombre, String apellidos, int idFederacion) {
		super(id, edad, nombre, apellidos);
		this.idFederacion = idFederacion;
	}

	public int getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(int idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Dirige un Entrenamiento (Clase Entrenador)");
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}
	
	public void planificarEntrenamiento() {
		System.out.println("Planifica un Entrenamiento");
	}

}
