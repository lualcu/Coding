package composicion.vehiculo2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vehiculo {
	
	Image img = new ImageIcon("src/general.icons/CARRO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
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
	
	public void arrancar() {
		JOptionPane.showMessageDialog(null, "El Vehiculo Arrancó", 
				"Vehiculo", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	public void detenerse() {
		JOptionPane.showMessageDialog(null, "El Vehiculo se Detuvó", 
				"Vehiculo", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	public void acelerar() {
		JOptionPane.showMessageDialog(null, "El Vehiculo Aceleró", 
				"Vehiculo", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	public void frenar() {
		JOptionPane.showMessageDialog(null, "El Vehiculo Frenó", 
				"Vehiculo", JOptionPane.INFORMATION_MESSAGE, icon);
	}
	

}
