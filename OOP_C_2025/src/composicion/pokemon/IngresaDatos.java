package composicion.pokemon;

import javax.swing.JOptionPane;

public class IngresaDatos {
	MuestraDatos m = new MuestraDatos();
	public void ingresaDatos() {
		// Declaracion Variables
		String nombre, especie, tipo, habitat;
		double peso, altura;
		// Solicitar Valores 
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Pokemon", JOptionPane.QUESTION_MESSAGE);
		especie = JOptionPane.showInputDialog(null, "Ingresa Especie: ", "Especie - Pokemon", JOptionPane.QUESTION_MESSAGE);
		tipo = JOptionPane.showInputDialog(null, "Ingresa Tipo: ", "Tipo - Pokemon", JOptionPane.QUESTION_MESSAGE);
		habitat = JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Habitat - Pokemon", JOptionPane.QUESTION_MESSAGE);
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Peso - Pokemon", JOptionPane.QUESTION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Altura: ", "Altura - Pokemon", JOptionPane.QUESTION_MESSAGE));
		
		//Crear un Objeto de la Clase Pokemon
		
		Pokemon p = new Pokemon(nombre, especie, tipo, peso, altura, habitat);
		
		// Enviar el Objeto p a la clase MuestraDatos
		m.muestraDatos(p);
		
	}
}
