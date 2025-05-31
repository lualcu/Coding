package polimorfismo.persona;

public class Directivo extends Persona{
	
	private String puesto,departamento,turno;
	private int antiguedad;

	public Directivo(String nombre, String nacionalidad, int edad, String sexo, String puesto, String departamento,
			String turno, int antiguedad) {
		super(nombre, nacionalidad, edad, sexo);
		this.puesto = puesto;
		this.departamento = departamento;
		this.turno = turno;
		this.antiguedad = antiguedad;
	}

	public String getPuesto() {
		return puesto;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getTurno() {
		return turno;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	

}
