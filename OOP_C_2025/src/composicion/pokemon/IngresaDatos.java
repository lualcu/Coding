package composicion.pokemon;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	MuestraDatos m = new MuestraDatos();
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	public void ingresaDatos() {
		// Declaracion Variables
		String nombre, especie, tipo, habitat;
		double peso, altura;
		// Solicitar Valores 
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null);
		especie = (String)JOptionPane.showInputDialog(null, "Ingresa Especie: ",
				"Especie - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null);
		tipo = (String)JOptionPane.showInputDialog(null, "Ingresa Tipo: ",
				"Tipo - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", 
				"Habitat - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ",
				"Peso - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null));
		altura = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Altura: ", 
				"Altura - Pokemon", JOptionPane.QUESTION_MESSAGE, preg, null, null));
		
		//Crear un Objeto de la Clase Pokemon
		
		Pokemon p = new Pokemon(nombre, especie, tipo, peso, altura, habitat);
		
		// Enviar el Objeto p a la clase MuestraDatos
		m.muestraDatos(p);
		
	}
}
