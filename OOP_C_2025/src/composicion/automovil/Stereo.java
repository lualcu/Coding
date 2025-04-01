package composicion.automovil;

public class Stereo {
	
	private int serie;
	private String marca, puertoUSB, potencia;
	
	public Stereo(int serie, String marca, String puertoUSB, String potencia) {
		this.serie = serie;
		this.marca = marca;
		this.puertoUSB = puertoUSB;
		this.potencia = potencia;
	}

	public int getSerie() {
		return serie;
	}

	public String getMarca() {
		return marca;
	}

	public String getPuertoUSB() {
		return puertoUSB;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setPuertoUSB(String puertoUSB) {
		this.puertoUSB = puertoUSB;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	
	
}
