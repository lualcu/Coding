package herencia.vehiculo;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	//Definicion del método Constructor
	
	public Vehiculo(String matricula, String marca, String modelo, String color, double precio) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}
	
	public Vehiculo() {
		
	}
	
	// Definicion de los Metodos Set´s y Get's

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
	
	
	
	
	
	

}
