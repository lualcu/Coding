package polimorfismo.animales;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Ingresa {
	
	private String nombre;
	private double peso;
	private int edad;
	private String sexo,habitat;
	
	private String tamaño,especie;
	
	private String garras,vista;
	private int longevidad;
	
	private String alimentacion;
	
	private String colorPiel,region;
	private String colorPelo,raza;
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Animal a;
	
	Fichero f = new Fichero();
	
	public void ingresaAguila() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		tamaño = (String)JOptionPane.showInputDialog(null, "Ingresa Tamaño: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		especie  = (String)JOptionPane.showInputDialog(null, "Ingresa Especie: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		garras = (String)JOptionPane.showInputDialog(null, "Ingresa Garras: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		vista = (String)JOptionPane.showInputDialog(null, "Ingresa Vista: ", "Aguila",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		a = new Aguila(nombre,peso,edad,sexo,habitat,tamaño,especie,garras,vista);
		
		f.almacenaAguila((Aguila)a);
		
	}
	
	public void ingresaTortuga() {
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		tamaño = (String)JOptionPane.showInputDialog(null, "Ingresa Tamaño: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		especie  = (String)JOptionPane.showInputDialog(null, "Ingresa Especie: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		longevidad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Longevidad: ", "Tortuga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		a = new Tortuga(nombre,peso,edad,sexo,habitat,tamaño,especie,longevidad);
		
		f.almacenaTortuga((Tortuga)a);
		
	}
	
	public void ingresaDelfin() {
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		alimentacion = (String)JOptionPane.showInputDialog(null, "Ingresa Alimentacion: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		colorPiel  = (String)JOptionPane.showInputDialog(null, "Ingresa Color de Piel: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		region  = (String)JOptionPane.showInputDialog(null, "Ingresa Región: ", "Delfin",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		a = new Delfin(nombre,peso,edad,sexo,habitat,alimentacion,colorPiel,region);
		
		f.almacenaDelfin((Delfin)a);
		
	}
	
	public void ingresaPerro() {
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		habitat = (String)JOptionPane.showInputDialog(null, "Ingresa Habitat: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		alimentacion = (String)JOptionPane.showInputDialog(null, "Ingresa Alimentacion: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		colorPelo  = (String)JOptionPane.showInputDialog(null, "Ingresa Color de Pelo: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		raza  = (String)JOptionPane.showInputDialog(null, "Ingresa Raza: ", "Perro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		a = new Perro(nombre,peso,edad,sexo,habitat,alimentacion,colorPelo,raza);
		
		f.almacenaPerro((Perro)a);
		
	}
	
	

}
