package composicion.evaluacion;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {
	
	Imprime i = new Imprime();
	
	// Crear iconos
	Image imgPreg = new ImageIcon(getClass().getResource("/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Ciclista ingresaCiclista() {
		
		String nombre, apellido, equipo, email, patrocinador;
		int edad, numero;
		double salario;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ",
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ",
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		equipo = (String)JOptionPane.showInputDialog(null, "Ingresa Equipo: ", 
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ",
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		patrocinador = (String)JOptionPane.showInputDialog(null, "Ingresa Patrocinador: ", 
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ",
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		numero = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Numero: ", 
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ", 
				"Ciclista", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		Ciclista ciclista = new Ciclista(nombre,apellido,equipo,email,patrocinador,edad,numero,salario);
		
		i.imprimeCiclista(ciclista);
		
		return ciclista;
	}
	
	public Entrenador ingresaEntrenador() {
		String nombre, apellido, sexo, email, direccion, equipo;
		int edad, telefono;
		double salario;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", ""
				+ "Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		equipo = (String)JOptionPane.showInputDialog(null, "Ingresa Equipo: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		
		
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		telefono = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ", 
				"Entrenador", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		Entrenador entrenador = new Entrenador(nombre,apellido,sexo,email,direccion,equipo,edad,telefono,salario);
		
		i.imprimeEntrenador(entrenador);
		
		return entrenador;
	}
	
	public Terapeuta ingresaTerapeuta() {
		String nombre, email, direccion;
		int edad;
		double salario;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Terapeuta", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ", 
				"Terapeuta", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ",
				"Terapeuta", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", 
				"Terapeuta", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ",
				"Terapeuta", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		Terapeuta terapeuta = new Terapeuta(nombre,email,direccion,edad,salario);
		
		i.imprimeTerapeuta(terapeuta);
		
		return terapeuta;
	}
	
	public Pais ingresaPais(Terapeuta terapeuta, Ciclista ciclista, Entrenador entrenador) {
		
		String nombre, equipo, ruta, www;
		int espectadores;
		
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ",
				"Pais", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		equipo = (String)JOptionPane.showInputDialog(null, "Ingresa Equipo: ",
				"Pais", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		ruta = (String)JOptionPane.showInputDialog(null, "Ingresa Ruta: ",
				"Pais", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		www = (String)JOptionPane.showInputDialog(null, "Ingresa WWW: ", 
				"Pais", JOptionPane.INFORMATION_MESSAGE, preg, null,null);
		
		espectadores = Integer.parseInt((String)JOptionPane.showInputDialog(null, 
				"Ingresa Espectadores: ", "Pais", JOptionPane.INFORMATION_MESSAGE, preg, null,null));
		
		Pais pais = new Pais(terapeuta,ciclista,entrenador,nombre,equipo,ruta,www,espectadores);
		
		i.imprimePais(pais);
		
		return pais;
		
	}

}
