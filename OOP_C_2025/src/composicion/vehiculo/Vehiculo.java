package composicion.vehiculo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Vehiculo {
	
	Image img = new ImageIcon("src/general.icons/CARRO.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	// Definicion de los Atributos de la Clase
	String marca;
	String matricula;
	String modelo;
	String color;
	double precio;
	int cilindros;
	String tipoVehiculo;
	double tipoMotor;
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
