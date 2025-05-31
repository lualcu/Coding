package polimorfismo.vehiculo2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	
	Image imgPreg = new ImageIcon(getClass().getResource(
			"/general.icons/PREGUNTA.png")).getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	
	String marca,modelo,matricula,departamento;
	int nCilindros, nPuertas, capacidadCarga;
	
	ImprimeDatos i = new ImprimeDatos();
	Fichero f = new Fichero();
	
	public void ingresaDeportivo() {
		//Solicitar Valores Iniciales
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Deportivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Deportivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		matricula = (String)JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Deportivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nCilindros = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Num. Cilindros: ", 
				"Cilindros - Deportivo",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo d = new Deportivo(matricula,marca,modelo,nCilindros);
		
		f.almacenaDeportivo((Deportivo)d);
		
		
	}
	
	public void ingresaFamiliar() {
		//Solicitar Valores Iniciales
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Familiar",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Familiar",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		matricula = (String)JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Familiar",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		nPuertas = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Num. Puertas: ", 
				"Puertas - Familiar",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo fa = new Familiar(matricula,marca,modelo,nPuertas);
		
		f.almacenaFamiliar((Familiar)fa);
		
	}
	public void ingresaCarga() {
		//Solicitar Valores Iniciales
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Carga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Carga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		matricula = (String)JOptionPane.showInputDialog(null, "Ingresa Matricula: ", "Matricula - Carga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		capacidadCarga = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Capacidad: ", 
				"Capacidad - Carga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		departamento = (String)JOptionPane.showInputDialog(null, "Ingresa Departamento: ",
				"Departamento - Carga",
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		// Instanciar a la Clase Deportivo mediante el polimorfismo
		
		Vehiculo c = new Carga(matricula,marca,modelo,capacidadCarga,departamento);
		
		f.almacenaCarga((Carga)c);
		
	}

}
