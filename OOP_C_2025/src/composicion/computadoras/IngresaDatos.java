package composicion.computadoras;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresaDatos {
	
	MuestraDatos m = new MuestraDatos();
	
	Image imgPreg = new ImageIcon("src/general.icons/PREGUNTA.png").getImage();
	ImageIcon preg= new ImageIcon(imgPreg.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void ingresaDatos() {
		String marca, modelo, procesador;
		double hd, pantalla, peso, costo;
		int ram,serie;
		
		
		
		marca = (String)JOptionPane.showInputDialog(null, "Ingresa Marca: ", 
				"Marca - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null); 
		modelo = (String)JOptionPane.showInputDialog(null, "Ingresa Modelo: ",
				"Modelo - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null); 
		procesador = (String)JOptionPane.showInputDialog(null, "Ingresa Procesador: ",
				"Procesador - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null); 
		
		hd = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa HD: ",
				"HD - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		pantalla = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Pantalla: ",
				"Pantalla - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		peso = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Peso: ", 
				"Peso - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		costo = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Ingresa Costo: ", 
				"Costo - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		ram = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa RAM: ", 
				"RAM - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		serie = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Ingresa Serie: ",
				"Serie - Computadora", JOptionPane.INFORMATION_MESSAGE, preg, null, null));
		
		Computadora c = new Computadora(marca,
										modelo,
										procesador,
										ram,
										hd,
										pantalla,
										peso,
										serie,
										costo);
		
		m.muestraDatos(c);
		
	}

}
