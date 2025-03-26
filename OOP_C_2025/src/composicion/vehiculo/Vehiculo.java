package composicion.vehiculo;

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

}
