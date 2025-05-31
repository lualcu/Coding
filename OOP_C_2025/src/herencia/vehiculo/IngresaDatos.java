package herencia.vehiculo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgAvi = new ImageIcon("src/general.icons/AVISO.png").getImage();
	ImageIcon avi= new ImageIcon(imgAvi.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	String matricula;
	String marca;
	String modelo;
	String color;
	String transmision;
	double precio;
	int puertas;
	int cilindros;
	int carga;
	int volumen;
	
	public Turismo ingresaTurismo() {
		// Solicitar los Valores de Inicio
		matricula = (String)JOptionPane.showInputDialog(null,
				"Ingresa Matricula", "Matricula", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		marca = (String)JOptionPane.showInputDialog(null,
				"Ingresa Marca", "Marca", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null,
				"Ingresa Modelo", "Modelo", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		color = (String)JOptionPane.showInputDialog(null,
				"Ingresa Color", "Color", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		transmision = (String)JOptionPane.showInputDialog(null,
				"Ingresa Transmision", "Transmision", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null,
				"Ingresa Precio", "Precio", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		puertas = Integer.parseInt((String)JOptionPane.showInputDialog(null,
				"Ingresa Puertas", "Puertas", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		// Instanciar un Objeto de la Clase Turismo
		
		Turismo t = new Turismo(matricula,marca,modelo,color,precio,puertas,transmision);
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente",
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE,avi);
		
		return t;
	}
	
	public Deportivo ingresaDeportivo() {
		// Solicitar los Valores de Inicio
		matricula = (String)JOptionPane.showInputDialog(null,
				"Ingresa Matricula", "Matricula", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		marca = (String)JOptionPane.showInputDialog(null,
				"Ingresa Marca", "Marca", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null,
				"Ingresa Modelo", "Modelo", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		color = (String)JOptionPane.showInputDialog(null,
				"Ingresa Color", "Color", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null,
				"Ingresa Precio", "Precio", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		cilindros = Integer.parseInt((String)JOptionPane.showInputDialog(null,
				"Ingresa Cilindros", "Cilindros", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		// Instanciar un Objeto de la Clase Turismo
		
		Deportivo d = new Deportivo(matricula,marca,modelo,color,precio,cilindros);
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente",
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE,avi);
		
		return d;
	}
	
	public Furgoneta ingresaFurgoneta() {
		// Solicitar los Valores de Inicio
		matricula = (String)JOptionPane.showInputDialog(null,
				"Ingresa Matricula", "Matricula", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		marca = (String)JOptionPane.showInputDialog(null,
				"Ingresa Marca", "Marca", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		modelo = (String)JOptionPane.showInputDialog(null,
				"Ingresa Modelo", "Modelo", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		color = (String)JOptionPane.showInputDialog(null,
				"Ingresa Color", "Color", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null);
		
		precio = Double.parseDouble((String)JOptionPane.showInputDialog(null,
				"Ingresa Precio", "Precio", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		carga = Integer.parseInt((String)JOptionPane.showInputDialog(null,
				"Ingresa Carga", "Carga", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		volumen = Integer.parseInt((String)JOptionPane.showInputDialog(null,
				"Ingresa Volumen", "Volumen", 
				JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		// Instanciar un Objeto de la Clase Turismo
		
		Furgoneta f = new Furgoneta(matricula,marca,modelo,color,precio,carga,volumen);
		JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente",
				"Ingreso - Datos", JOptionPane.INFORMATION_MESSAGE,avi);
		
		return f;
	}

}
