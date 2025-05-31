package herencia.seleccionfutbol;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ingresa {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	private int id,edad;
	private String nombre,apellido;
	private double peso;
	private String posicion;
	private int numero;
	private String especialidad;
	private int experiencia;
	private String idFederacion;
	
	Fichero f = new Fichero();
	
	public void ingresaFutbolista() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		posicion = (String)JOptionPane.showInputDialog(null, "Ingresa Posicion","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		numero = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Numero","Futbolista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
	
		Futbolista fu = new Futbolista(id, edad, nombre, apellido, peso, posicion, numero);
		
		f.almacenaFutbolista(fu);
		
	}
	
	public void ingresaMasajista() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		especialidad = (String)JOptionPane.showInputDialog(null, "Ingresa Especialidad","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		experiencia = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Experiencia","Masajista", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
	
		Masajista ma = new Masajista(id, edad, nombre, apellido, peso, especialidad, experiencia);
		
		f.almacenaMasajista(ma);
		
	}
	
	public void ingresaEntrenador() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		idFederacion = (String)JOptionPane.showInputDialog(null, "Ingresa ID Federación","Entrenador", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		
		Entrenador en = new Entrenador(id, edad, nombre, apellido, peso, idFederacion);
		
		f.almacenaEntrenador(en);
		
	}

}
