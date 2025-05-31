package herencia.vehiculo2;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	private String nombre,marca,color;
	private int modelo;
	private double precio,velocidad;
	
	public Vehiculo(String nombre, String marca, String color, int modelo, double precio, double velocidad) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	public int getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
	
	
	

}
