package composicion.empleados;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	//Instanciar un objeto de la clase MuestraDatos
	MuestraDatos m = new MuestraDatos();
	
	// Crear iconos
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void ingresaDatos() {
		//Declaracion de Variables
		String nombre, apellido, correo, empresa, ocupacion, sexo, origen;
		int edad;
		double salario, peso;
		
		//Ingresar Valores
		nombre = (String)JOptionPane.showInputDialog(null, "Ingresa Nombre: ",
				"Nombre - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		apellido = (String)JOptionPane.showInputDialog(null, "Ingresa Apellido: ",
				"Apellido - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		correo = (String)JOptionPane.showInputDialog(null, "Ingresa Correo: ",
				"Correo - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		empresa = (String)JOptionPane.showInputDialog(null, "Ingresa Empresa: ",
				"Empresa - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		ocupacion = (String)JOptionPane.showInputDialog(null, "Ingresa Ocupacion: ",
				"Ocupacion - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		sexo = (String)JOptionPane.showInputDialog(null, "Ingresa Sexo: ", 
				"Nombre - Sexo", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		origen = (String)JOptionPane.showInputDialog(null, "Ingresa Origen: ",
				"Origen - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		edad = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Edad: ",
				"Edad - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		salario = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Salario: ",
				"Salario - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ",
				"Peso - Empleado", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		
		//Instanciar un objeto de la clase Empleado
		Empleado e = new Empleado(nombre,apellido,correo,empresa,salario,ocupacion,
				edad,sexo,peso,origen);
		
		//Llamar al Metodo muestraDatos
		m.muestraDatos(e);

		
	}

}
