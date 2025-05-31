package polimorfismo.persona;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Ingresa {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	private String nombre,nacionalidad;
	private int edad;
	private String sexo;
	private String escuela;
	private double promedio;
	private String email;
	private String grado;
	private double salario;
	private String direccion;
	private String telefono;
	private String puesto,departamento,turno;
	private int antiguedad;
	
	Persona p;
	
	Fichero f = new Fichero();
	
	public void ingresaEstudiante() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nacionalidad = (String)JOptionPane.showInputDialog(null, "Ingresa Nacionalidad: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		escuela = (String)JOptionPane.showInputDialog(null, "Ingresa Escuela: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		promedio = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Promedio: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ", "Estudiante",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		p = new Estudiante(nombre,nacionalidad,edad,sexo,escuela,promedio,email);
		
		f.almacenaEstudiante((Estudiante)p);
		
	}
	
	public void ingresaMaestro() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nacionalidad = (String)JOptionPane.showInputDialog(null, "Ingresa Nacionalidad: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		grado = (String)JOptionPane.showInputDialog(null, "Ingresa Grado: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		telefono = (String)JOptionPane.showInputDialog(null, "Ingresa Telefono: ", "Maestro",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		
		p = new Maestro(nombre,nacionalidad,edad,sexo,grado,salario,direccion,telefono);
		
		f.almacenaMaestro((Maestro)p);
		
	}
	
	public void ingresaDirectivo() {
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nacionalidad = (String)JOptionPane.showInputDialog(null, "Ingresa Nacionalidad: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		puesto = (String)JOptionPane.showInputDialog(null, "Ingresa Puesto: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		departamento = (String)JOptionPane.showInputDialog(null, "Ingresa Departamento: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		turno = (String)JOptionPane.showInputDialog(null, "Ingresa Turno: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		antiguedad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Antiguedad: ", "Directivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		p = new Directivo(nombre,nacionalidad,edad,sexo,puesto,departamento,turno,antiguedad);
		
		f.almacenaDirectivo((Directivo)p);
		
	}

}
