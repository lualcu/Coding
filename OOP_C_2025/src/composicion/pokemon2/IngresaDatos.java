package composicion.pokemon2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	Image imgAviso = new ImageIcon("src/general.icons/AVISO.png").getImage();
	ImageIcon aviso= new ImageIcon(imgAviso.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	MuestraDatos m = new MuestraDatos();
	public void ingresaDatos() {
		// Declaracion Variables
		String nombre, especie, tipo, habitat;
		double peso, altura;
		// Solicitar Valores 
		nombre = (String) JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Pokemon",
				JOptionPane.QUESTION_MESSAGE, aviso, null, null);
		especie = (String) JOptionPane.showInputDialog(null, "Ingresa Especie: ", "Especie - Pokemon", 
				JOptionPane.QUESTION_MESSAGE, aviso, null, null);
		tipo = (String) JOptionPane.showInputDialog(null, "Ingresa Tipo: ", "Tipo - Pokemon", 
				JOptionPane.QUESTION_MESSAGE, aviso, null, null);
		habitat = (String) JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Habitat - Pokemon",
				JOptionPane.QUESTION_MESSAGE, aviso, null, null);
		peso = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingresa Peso: ",
				"Peso - Pokemon", JOptionPane.QUESTION_MESSAGE, aviso, null, null));
		altura = Double.parseDouble((String) JOptionPane.showInputDialog(null, "Ingresa Altura: ", 
				"Altura - Pokemon", JOptionPane.QUESTION_MESSAGE, aviso, null, null));
		
		//Crear un Objeto de la Clase Pokemon
		
		Pokemon p = new Pokemon(nombre, especie, tipo, peso, altura, habitat);
		
		// Enviar el Objeto p a la clase MuestraDatos
		m.muestraDatos(p);
		
	}
}
