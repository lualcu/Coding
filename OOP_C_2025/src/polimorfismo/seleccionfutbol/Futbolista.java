package polimorfismo.seleccionfutbol;

public class Futbolista extends SeleccionFutbol {
	
	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, int edad, String nombre, String apellidos, int dorsal, String demarcacion) {
		super(id, edad, nombre, apellidos);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	public int getDorsal() {
		return dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	@Override 
	public void entrenamiento() {
		System.out.println("Realiza un Entrenamiento (Clase Futbolista)");
	}
	@Override
	public void partidoFutbol() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

}
