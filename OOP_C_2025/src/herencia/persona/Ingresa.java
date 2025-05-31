package herencia.persona;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ingresa {
	
	private String nombre,apellido,edad,sexo,escuela,grado,puesto,departamento;
	private double promedio,salario;
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgAvi = new ImageIcon(getClass().getResource(
			"/general.icons/AVISO.png")).getImage();
	ImageIcon avi= new ImageIcon(imgAvi.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Estudiante ingresaEstudiante() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre ",
				"Nombre", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido ", 
				"Apellido", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		edad = (String)JOptionPane.showInputDialog(null, "Ingresa Edad ", "Edad",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo ", "Sexo",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		escuela = (String)JOptionPane.showInputDialog(null, "Ingresa Escuela ",
				"Escuela", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		promedio = Double.parseDouble((String)JOptionPane.showInputDialog(
				null,"Ingresa Promedio ", "Promedio",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null));
		
		JOptionPane.showMessageDialog(null, "Ingresados Correctamente", 
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE, avi);
		
		return new Estudiante(nombre,apellido,edad,sexo,escuela,promedio);
		
	}
	
	public Maestro ingresaMaestro() {
		nombre = (String)JOptionPane.showInputDialog(null, 
				"Ingresa Nombre ", "Nombre", 
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido ",
				"Apellido", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		edad = (String)JOptionPane.showInputDialog(null, "Ingresa Edad ", "Edad",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo ", "Sexo",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		grado = (String)JOptionPane.showInputDialog(null, "Ingresa Grado ", "Grado",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(
				null, "Ingresa Salario ", "Salario",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null));
		
		JOptionPane.showMessageDialog(null, "Ingresados Correctamente",
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE, avi);
		
		return new Maestro(nombre,apellido,edad,sexo,grado,salario);
		
	}
	
	public Directivo ingresaDirectivo() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre ", 
				"Nombre", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido ", 
				"Apellido", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		edad = (String)JOptionPane.showInputDialog(null, "Ingresa Edad ", "Edad",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo ", "Sexo",
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		puesto = (String)JOptionPane.showInputDialog(null, "Ingresa Puesto ", "Puesto", 
				JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		departamento = (String)JOptionPane.showInputDialog(null, "Ingresa Departamento", 
				"Departamento", JOptionPane.INFORMATION_MESSAGE,preg, null, null);
		
		JOptionPane.showMessageDialog(null, "Ingresados Correctamente", 
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE, avi);
		
		return new Directivo(nombre,apellido,edad,sexo,puesto,departamento);
		
	}

}
