package composicion.empleados;

import javax.swing.JOptionPane;

public class IngresaDatos {
	//Instanciar un objeto de la clase MuestraDatos
	MuestraDatos m = new MuestraDatos();
	
	public void ingresaDatos() {
		//Declaracion de Variables
		String nombre, apellido, correo, empresa, ocupacion, sexo, origen;
		int edad;
		double salario, peso;
		
		//Ingresar Valores
		nombre = JOptionPane.showInputDialog(null, "Ingresa Nombre: ", "Nombre - Empleado", JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Ingresa Apellido: ", "Apellido - Empleado", JOptionPane.INFORMATION_MESSAGE);
		correo = JOptionPane.showInputDialog(null, "Ingresa Correo: ", "Correo - Empleado", JOptionPane.INFORMATION_MESSAGE);
		empresa = JOptionPane.showInputDialog(null, "Ingresa Empresa: ", "Empresa - Empleado", JOptionPane.INFORMATION_MESSAGE);
		ocupacion = JOptionPane.showInputDialog(null, "Ingresa Ocupacion: ", "Ocupacion - Empleado", JOptionPane.INFORMATION_MESSAGE);
		sexo = JOptionPane.showInputDialog(null, "Ingresa Sexo: ", "Nombre - Sexo", JOptionPane.INFORMATION_MESSAGE);
		origen = JOptionPane.showInputDialog(null, "Ingresa Origen: ", "Origen - Empleado", JOptionPane.INFORMATION_MESSAGE);
		edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Edad: ", "Edad - Empleado", JOptionPane.INFORMATION_MESSAGE));
		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Salario: ", "Salario - Empleado", JOptionPane.INFORMATION_MESSAGE));
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Peso - Empleado", JOptionPane.INFORMATION_MESSAGE));
		
		
		//Instanciar un objeto de la clase Empleado
		Empleado e = new Empleado(nombre, apellido, correo, empresa, salario, ocupacion, edad, sexo, peso, origen);
		
		//Llamar al Metodo muestraDatos
		m.muestraDatos(e);

		
	}

}
