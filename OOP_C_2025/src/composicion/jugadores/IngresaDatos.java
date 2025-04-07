package composicion.jugadores;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


	
public class IngresaDatos {
	//Instanciar un objeto de la clase MuestraDatos
	MuestraDatos m = new MuestraDatos();
	
	Image img = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void ingresaDatos() {

		String nombre, apellido, correo, equipo, posicion, nacionalidad;
		int edad, numeral;
		double salario;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", ""
				+ "Apellido - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		correo = (String)JOptionPane.showInputDialog(null, "Ingresa Correo: ",
				"Correo - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		equipo = (String)JOptionPane.showInputDialog(null, "Ingresa Equipo: ",
				"Equipo - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		posicion = (String)JOptionPane.showInputDialog(null, "Ingresa Posicion: ",
				"Posicion - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		nacionalidad = (String)JOptionPane.showInputDialog(null, "Ingresa Nacionalidad: ", 
				"Nacionalidad - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ",
				"Edad - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null));
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ",
				"Salario - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null));
		numeral = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Dorsal: ",
				"Dorsal - Jugador", JOptionPane.INFORMATION_MESSAGE, icon, null, null));
		
		
		Jugador j = new Jugador(nombre,apellido,correo,equipo,salario,posicion, 
				edad,nacionalidad,numeral);
		
		m.muestraDatos(j);
		
	}

}

