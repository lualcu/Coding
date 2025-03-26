package composicion.vehiculo2;

public class Vehiculo {
	// Definicion de los Atributos de la Clase
	private String marca;
	private String matricula;
	private String modelo;
	private String color;
	private double precio;
	private int cilindros;
	private String tipoVehiculo;
	private double tipoMotor;
	// Definicion del Metodo Constructor 
	public Vehiculo(String marca,
			String matricula,
			String modelo, 
			String color,
			double precio,
			int cilindros,
			String tipoVehiculo,
			double tipoMotor) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cilindros = cilindros;
		this.tipoVehiculo = tipoVehiculo;
		this.tipoMotor = tipoMotor;
		
	}
	// Definicion de los Metodos get's
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
	public String getTipoVehiculo() {
		return this.tipoVehiculo;
	}
	public double getPrecio() {
		return this.precio;
	}
	public int getCilindros() {
		return this.cilindros;
	}
	public double getTipoMotor() {
		return this.tipoMotor;
	}
	// Definicion de los Métodos set's
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
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public void setTipoMotor(double tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	// Definicion de Métodos de Operaciones 
	
	public String acelerar() {
		return "El Automóvil Acelera";
	}
	

}
