package composicion.pokemon;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pokemon {
	
	Image imgPok = new ImageIcon("src/general.icons/POKEMON.png").getImage();
	ImageIcon pok= new ImageIcon(imgPok.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	// Definicion de los Atributos de la Clase
	String nombre;
	String especie;
	String tipo;
	double peso;
	double altura;
	String habitat;
	
	// Definicion del Metodo Constructor
	
	public Pokemon(String nombre, String especie, String tipo, double peso, double altura, String habitat) {
		this.nombre = nombre;
		this.especie = especie;
		this.tipo = tipo;
		this.peso = peso;
		this.altura = altura;
		this.habitat = habitat;
	}
	
	public void comer() {
		JOptionPane.showMessageDialog(null, "El Pokemon Comió", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, pok);
	}
	public void dormir() {
		JOptionPane.showMessageDialog(null, "El Pokemon Durmió", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, pok);
	}
	public void pelear() {
		JOptionPane.showMessageDialog(null, "El Pokemon Peleó", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, pok);
	}
	public void saltar() {
		JOptionPane.showMessageDialog(null, "El Pokemon Saltó", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, pok);
	}
	public void correr() {
		JOptionPane.showMessageDialog(null, "El Pokemon Corrió", 
				"Pokemon", JOptionPane.INFORMATION_MESSAGE, pok);
	}

}
