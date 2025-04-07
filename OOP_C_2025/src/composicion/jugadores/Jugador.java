package composicion.jugadores;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jugador {
	
	Image imgJug= new ImageIcon("src/general.icons/JUGADOR.png").getImage();
	ImageIcon jug = new ImageIcon(imgJug.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	String nombre;
	String apellido;
	String correo;
	String equipo;
	double salario;
	String posicion;
	int edad;
	String nacionalidad;
	int numeral;
	
	public Jugador(String nombre,String apellido,String correo,String equipo,
	double salario,String posicion,int edad,String nacionalidad,int numeral) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.equipo = equipo;
		this.salario = salario;
		this.posicion = posicion;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.numeral = numeral;
		
	}
	public void correr() {
		JOptionPane.showMessageDialog(null, "El jugador Corrió", 
				"Jugador", JOptionPane.INFORMATION_MESSAGE, jug);
	}
	public void saltar() {
		JOptionPane.showMessageDialog(null, "El jugador Saltó", 
				"Jugador", JOptionPane.INFORMATION_MESSAGE, jug);
	}
	public void pegar() {
		JOptionPane.showMessageDialog(null, "El jugador Pegó", 
				"Jugador", JOptionPane.INFORMATION_MESSAGE, jug);
	}
	public void anotar() {
		JOptionPane.showMessageDialog(null, "El jugador Anotó", 
				"Jugador", JOptionPane.INFORMATION_MESSAGE, jug);
	}
	public void festejar() {
		JOptionPane.showMessageDialog(null, "El jugador Festejó", 
				"Jugador", JOptionPane.INFORMATION_MESSAGE, jug);
	}

}
