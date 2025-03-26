package composicion.vehiculo3;

public class Vehiculo {
	
	// Definicion de los Atributos
	
	private Chofer chofer; // Composicion
	private Empresa empresa; // Composicion
	private String marca;
	private String matricula;
	private String modelo;
	private String color;
	
	// Definicion del Metodo Constructor
	
	public Vehiculo(Chofer chofer, Empresa empresa, String marca, String matricula, String modelo, String color) {
		this.chofer = chofer;
		this.empresa = empresa;
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
	}
	
	// Definicion de Metodos get's
	
	public Chofer getChofer() {
		return this.chofer;
	}
	public Empresa getEmpresa() {
		return this.empresa;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public String getModelo() {
		return this.modelo;
	}
	public String getColor() {
		return this.color;
	}
	
	// Definicion de Metodos set's
	
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
