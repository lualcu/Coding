package composicion.perros2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Perro {
	
	Image imgMas= new ImageIcon("src/general.icons/MASCOTA.png").getImage();
	ImageIcon mas = new ImageIcon(imgMas.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	private String nombre;
	private String raza;
	private double altura;
	private double peso;
	private String nacimiento;
	
	public Perro(String nombre, String raza, double altura, double peso, String nacimiento) {
		this.nombre = nombre;
		this.raza = raza;
		this.altura = altura;
		this.peso = peso;
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public String getRaza() {
		return raza;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public void comer() {
		JOptionPane.showMessageDialog(null, "El perro Comió", 
				"Mascota", JOptionPane.INFORMATION_MESSAGE, mas);
	}
	public void dormir() {
		JOptionPane.showMessageDialog(null, "El perro Durmió", 
				"Mascota", JOptionPane.INFORMATION_MESSAGE, mas);
	}
	public void ladrar() {
		JOptionPane.showMessageDialog(null, "El perro Ladró", 
				"Mascota", JOptionPane.INFORMATION_MESSAGE, mas);
	}
	public void saltar() {
		JOptionPane.showMessageDialog(null, "El perro Saltó", 
				"Mascota", JOptionPane.INFORMATION_MESSAGE, mas);
	}
	public void correr() {
		JOptionPane.showMessageDialog(null, "El perro Corrió", 
				"Mascota", JOptionPane.INFORMATION_MESSAGE, mas);
	}
	
	

}