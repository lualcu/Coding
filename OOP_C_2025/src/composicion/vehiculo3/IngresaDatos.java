package composicion.vehiculo3;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	// Instanciar un Objeto de la Clase MuestraDatos
	Imprime i = new Imprime();
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public Chofer ingresaChofer() {
		// Declaracion de Variables locales
		String nombre, apellido, direccion, email;
		int edad;
		double salario;
		// Solicitar los valores de Inicio
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ", 
				"Nombre - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ", 
				"Apellido - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ",
				"Direccion - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		email = (String)JOptionPane.showInputDialog(null, "Ingresa Email: ",
				"Email - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null,"Ingresa Edad: ", 
				"Edad - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ", 
				"Salario - Chofer", JOptionPane.INFORMATION_MESSAGE, preg,null,null));
		// Crear Objeto de la Clase Chofer
		Chofer ch = new Chofer(nombre, apellido, direccion, email, edad, salario);
		// Llamar al metodo datosChofer de la clase Imprime
		i.datosChofer(ch);
		return ch;
		
	}
	
	public Empresa IngresaEmpresa() {
		String nombre, direccion, rfc, www;
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ",
				"Nombre - Empresa", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		rfc = (String)JOptionPane.showInputDialog(null, "Ingresa RFC: ",
				"RFC - Empresa", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		direccion = (String)JOptionPane.showInputDialog(null, "Ingresa Direccion: ", 
				"Direccion - Empresa", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		www = (String)JOptionPane.showInputDialog(null, "Ingresa Página Web: ",
				"WWW - Empresa", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		// Crear Objeto de la Clase Empresa
		Empresa e = new Empresa(nombre, direccion, rfc, www);
		// Llamar al metodo datosEmpresa de la clase Imprime
		i.datosEmpresa(e);
		return e;
	}
	
	public void ingresaVehiculo(Chofer chofer, Empresa empresa) {
		String marca, matricula, modelo, color;
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ",
				"Marca - Vehiculo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		matricula = (String)JOptionPane.showInputDialog(null, "Ingresa Matricula: ", 
				"Matricula - Vehiculo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ",
				"Modelo - Vehiculo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		color = (String)JOptionPane.showInputDialog(null, "Ingresa Color: ", 
				"Color - Vehiculo", JOptionPane.INFORMATION_MESSAGE, preg,null,null);
		// Crear Objeto de la Clase Vehiculo
		Vehiculo ve = new Vehiculo(chofer,empresa,marca,modelo,matricula,color);
		// Llamar al metodo datosVehiculo de la Clase Imprime
		i.datosVehiculo(ve);
	}
}
