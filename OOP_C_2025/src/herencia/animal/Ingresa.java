package herencia.animal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ingresa {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	String nombre;
	double peso;
	int edad;
	String alimento;
	String habitat;
	Fichero f = new Fichero();
	
	public void ingresaCan() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Canino", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso","Canino", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Canino", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		alimento = (String)JOptionPane.showInputDialog(null, "Ingresa Alimento","Canino", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat","Canino", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		


		Canino c = new Canino(nombre,peso,edad,alimento,habitat);
		
		f.almacenaDatos(c);
	}

}
