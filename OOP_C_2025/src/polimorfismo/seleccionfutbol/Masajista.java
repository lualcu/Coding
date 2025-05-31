package polimorfismo.seleccionfutbol;

public class Masajista extends SeleccionFutbol{
	
	private String titulacion;
	private int añosExperiencia;
	public Masajista(int id, int edad, String nombre, String apellidos, String titulacion, int añosExperiencia) {
		super(id, edad, nombre, apellidos);
		this.titulacion = titulacion;
		this.añosExperiencia = añosExperiencia;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public int getAñosExperiencia() {
		return añosExperiencia;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;
	}
	
	@Override 
	public void entrenamiento() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}
	
	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
	
	

}
