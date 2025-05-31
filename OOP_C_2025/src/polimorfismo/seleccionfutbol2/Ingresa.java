package polimorfismo.seleccionfutbol2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ingresa {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	private int id;
	private String nombre,apellido;
	private double peso;
	private int edad;
	
	private String posicion;
	private int numero;
	private double salario;
	private String altura;
	
	private String especialidad;
	private int experiencia;
	private String email;
	private String telefono;
	
	private String idFederacion;
	private String campeonatos;
	private int equipos;
	private int auxiliares;
	
	Fichero f = new Fichero();
	
	SeleccionFutbol s;
	
	public void ingresaFutbolista() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = 	Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		posicion = (String)JOptionPane.showInputDialog(null, "Ingresa Posicion: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		numero = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Numero: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		altura = (String)JOptionPane.showInputDialog(null, "Ingresa Altura: ", "Futbolista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		s = new Futbolista(id,nombre,apellido,peso,edad,posicion,numero,salario,altura);
		
		f.almacenaFutbolista((Futbolista)s);
	}
	
	public void ingresaMasajista() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = 	Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		especialidad = (String)JOptionPane.showInputDialog(null, "Ingresa Especialidad: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		experiencia = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Experiencia: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		telefono = (String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Masajista", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		s = new Masajista(id,nombre,apellido,peso,edad,especialidad,experiencia,email,telefono);
		
		f.almacenaMasajista((Masajista)s);
	}
	
	public void ingresaEntrenador() {
		id = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa ID: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		edad = 	Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		idFederacion = (String)JOptionPane.showInputDialog(null, "Ingresa ID Federacion: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		campeonatos = (String)JOptionPane.showInputDialog(null, "Ingresa Campeonatos: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		equipos = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Equipos: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		auxiliares  = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Auxiliares: ", "Entrenador", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		s = new Entrenador(id,nombre,apellido,peso,edad,idFederacion,campeonatos,equipos,auxiliares);
		
		f.almacenaEntrenador((Entrenador)s);
	}
	
	
	
}
