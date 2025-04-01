package composicion.automovil;

public class Motor {
	
	private String cilindros, caballos, potencia, fabricante, origen;
	private int identificacion;
	
	public Motor(String cilindros, String caballos, String potencia, String fabricante, String origen,
			int identificacion) {
		this.cilindros = cilindros;
		this.caballos = caballos;
		this.potencia = potencia;
		this.fabricante = fabricante;
		this.origen = origen;
		this.identificacion = identificacion;
	}

	public String getCilindros() {
		return cilindros;
	}

	public String getCaballos() {
		return caballos;
	}

	public String getPotencia() {
		return potencia;
	}

	public String getFabricante() {
		return fabricante;
	}

	public String getOrigen() {
		return origen;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setCilindros(String cilindros) {
		this.cilindros = cilindros;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	

}
