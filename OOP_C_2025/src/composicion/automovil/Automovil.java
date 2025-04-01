package composicion.automovil;

public class Automovil {
	
	
	private Motor motor;
	private Stereo stereo;
	
	private String marca,modelo,rendimiento,combustible;
	private int capacidad,numPuertas,bolsasSeguridad;
	
	public Automovil(Motor motor, Stereo stereo, String marca, String modelo, String rendimiento, String combustible,
			int capacidad, int numPuertas, int bolsasSeguridad) {
		this.motor = motor;
		this.stereo = stereo;
		this.marca = marca;
		this.modelo = modelo;
		this.rendimiento = rendimiento;
		this.combustible = combustible;
		this.capacidad = capacidad;
		this.numPuertas = numPuertas;
		this.bolsasSeguridad = bolsasSeguridad;
	}

	public Motor getMotor() {
		return motor;
	}

	public Stereo getStereo() {
		return stereo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getRendimiento() {
		return rendimiento;
	}

	public String getCombustible() {
		return combustible;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public int getBolsasSeguridad() {
		return bolsasSeguridad;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setStereo(Stereo stereo) {
		this.stereo = stereo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public void setBolsasSeguridad(int bolsasSeguridad) {
		this.bolsasSeguridad = bolsasSeguridad;
	}
	
	
	
	

}
