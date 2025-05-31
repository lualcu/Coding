package polimorfismo.vehiculo;

import javax.swing.JOptionPane;

public class IngresaDatos {
	
	String marca,modelo,matricula,departamento;
	int nCilindros, nPuertas, capacidadCarga;
	
	ImprimeDatos i = new ImprimeDatos();
	
	public void ingresaDeportivo() {
		//Solicitar Valores Iniciales
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Deportivo",
				JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Deportivo",
				JOptionPane.INFORMATION_MESSAGE);
		matricula = JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Deportivo",
				JOptionPane.INFORMATION_MESSAGE);
		nCilindros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num. Cilindros: ", 
				"Cilindros - Deportivo",
				JOptionPane.INFORMATION_MESSAGE));
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo d = new Deportivo(matricula,marca,modelo,nCilindros);
		
		i.muestraDeportivo((Deportivo)d); //DownCasting
		
		
	}
	
	public void ingresaFamiliar() {
		//Solicitar Valores Iniciales
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Familiar",
				JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Familiar",
				JOptionPane.INFORMATION_MESSAGE);
		matricula = JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Familiar",
				JOptionPane.INFORMATION_MESSAGE);
		nPuertas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Num. Puertas: ", 
				"Puertas - Familiar",
				JOptionPane.INFORMATION_MESSAGE));
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo f = new Familiar(matricula,marca,modelo,nPuertas);
		
		i.muestraFamiliar((Familiar) f);
		
	}
	public void ingresaCarga() {
		//Solicitar Valores Iniciales
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Carga",
				JOptionPane.INFORMATION_MESSAGE);
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Carga",
				JOptionPane.INFORMATION_MESSAGE);
		matricula = JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Carga",
				JOptionPane.INFORMATION_MESSAGE);
		capacidadCarga = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Capacidad: ", 
				"Capacidad - Carga",
				JOptionPane.INFORMATION_MESSAGE));
		departamento = JOptionPane.showInputDialog(null, "Ingresa Departamento: ",
				"Departamento - Carga",
				JOptionPane.INFORMATION_MESSAGE);
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo c = new Carga(matricula,marca,modelo,capacidadCarga,departamento);
		
		i.muestraCarga((Carga)c);
		
	}

}
