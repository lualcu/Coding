package polimorfismo.animal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {

	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	private String nombre;
	private double peso;
	private int edad;
	private String habitat;
	private String alimento,raza;
	private String tamaño;
	private String origen;
	private String longevidad;
	
	Animal a;
	
	Fichero f = new Fichero();
	
	public void ingresaLobo() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		alimento = (String)JOptionPane.showInputDialog(null, "Ingresa Alimento: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		raza = (String)JOptionPane.showInputDialog(null, "Ingresa Raza: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		tamaño = (String)JOptionPane.showInputDialog(null, "Ingresa Tamaño: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		origen = (String)JOptionPane.showInputDialog(null, "Ingresa Origen: ", "Lobo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		a = new Lobo(nombre,peso,edad,habitat,alimento,raza,tamaño,origen);
		
		f.almacenaLobo((Lobo)a);
	}

	public void ingresaZorro() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		alimento = (String)JOptionPane.showInputDialog(null, "Ingresa Alimento: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		raza = (String)JOptionPane.showInputDialog(null, "Ingresa Raza: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		tamaño = (String)JOptionPane.showInputDialog(null, "Ingresa Tamaño: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		longevidad = (String)JOptionPane.showInputDialog(null, "Ingresa Longevidad: ", "Zorro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		a = new Zorro(nombre,peso,edad,habitat,alimento,raza,tamaño,longevidad);
		
		f.almacenaZorro((Zorro)a);
	}
	
}
