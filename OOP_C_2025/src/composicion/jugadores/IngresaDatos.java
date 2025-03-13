package composicion.jugadores;

import javax.swing.JOptionPane;


	
public class IngresaDatos {
	//Instanciar un objeto de la clase MuestraDatos
	MuestraDatos m = new MuestraDatos();
	
	public void ingresaDatos() {

		String nombre, apellido, correo, equipo, posicion, nacionalidad;
		int edad, numeral;
		double salario;
		
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Jugador", JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Apellido - Jugador", JOptionPane.INFORMATION_MESSAGE);
		correo = JOptionPane.showInputDialog(null, "Ingresa Correo: ", "Correo - Jugador", JOptionPane.INFORMATION_MESSAGE);
		equipo = JOptionPane.showInputDialog(null, "Ingresa Equipo: ", "Equipo - Jugador", JOptionPane.INFORMATION_MESSAGE);
		posicion = JOptionPane.showInputDialog(null, "Ingresa Posicion: ", "Posicion - Jugador", JOptionPane.INFORMATION_MESSAGE);
		nacionalidad = JOptionPane.showInputDialog(null, "Ingresa Nacionalidad: ", "Nacionalidad - Jugador", JOptionPane.INFORMATION_MESSAGE);
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Edad - Jugador", JOptionPane.INFORMATION_MESSAGE));
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Salario: ", "Salario - Jugador", JOptionPane.INFORMATION_MESSAGE));
		numeral = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Dorsal: ", "Dorsal - Jugador", JOptionPane.INFORMATION_MESSAGE));
		
		
		Jugador j = new Jugador(nombre, apellido, correo, equipo, salario, posicion, edad, nacionalidad, numeral);
		
		m.muestraDatos(j);
		
	}

}

