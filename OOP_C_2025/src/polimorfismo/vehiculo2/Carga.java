package polimorfismo.vehiculo2;

public class Carga extends Vehiculo{
	
	private int capacidadCarga;
	private String departamento;
	
	public Carga(String matricula, String marca, String modelo, int capacidadCarga, String departamento) {
		super(matricula, marca, modelo);
		this.capacidadCarga = capacidadCarga;
		this.departamento = departamento;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	

}
