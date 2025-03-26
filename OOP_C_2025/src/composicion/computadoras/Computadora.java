package composicion.computadoras;

public class Computadora {
	
	private String marca;
	private String modelo;
	private String procesador;
	private double hd;
	private double pantalla;
	private double peso;
	private double costo;
	private int ram;
	private int serie;
	
	public Computadora(String marca,
					   String modelo,
					   String procesador,
					   int ram,
					   double hd,
					   double pantalla,
					   double peso,
					   int serie,
					   double costo
					   ) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.hd = hd;
		this.pantalla = pantalla;
		this.peso = peso;
		this.costo = costo;
		this.ram = ram;
		this.serie = serie;
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.procesador;
	}
	public String getProcesador() {
		return this.procesador;
	}
	public double getHd() {
		return this.hd;
	}
	public double getPantalla() {
		return this.pantalla;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getCosto() {
		return this.costo;
	}
	public int getRam() {
		return this.ram;
	}
	public int getSerie() {
		return this.serie;
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public void setHd(double hd) {
		this.hd = hd;
	}
	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	

}
