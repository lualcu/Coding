package composicion.computadoras;

import javax.swing.JOptionPane;

public class IngresaDatos {
	MuestraDatos m = new MuestraDatos();
	public void ingresaDatos() {
		String marca, modelo, procesador;
		double hd, pantalla, peso, costo;
		int ram,serie;
		
		marca = JOptionPane.showInputDialog(null, "Ingresa Marca: ", "Marca - Computadora", JOptionPane.INFORMATION_MESSAGE); 
		modelo = JOptionPane.showInputDialog(null, "Ingresa Modelo: ", "Modelo - Computadora", JOptionPane.INFORMATION_MESSAGE); 
		procesador = JOptionPane.showInputDialog(null, "Ingresa Procesador: ", "Procesador - Computadora", JOptionPane.INFORMATION_MESSAGE); 
		
		hd = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa HD: ", "HD - Computadora", JOptionPane.INFORMATION_MESSAGE));
		pantalla = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Pantalla: ", "Pantalla - Computadora", JOptionPane.INFORMATION_MESSAGE));
		peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Peso: ", "Peso - Computadora", JOptionPane.INFORMATION_MESSAGE));
		costo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Costo: ", "Costo - Computadora", JOptionPane.INFORMATION_MESSAGE));
		
		ram = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa RAM: ", "RAM - Computadora", JOptionPane.INFORMATION_MESSAGE));
		serie = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Serie: ", "Serie - Computadora", JOptionPane.INFORMATION_MESSAGE));
		
		Computadora c = new Computadora(marca,modelo,procesador,ram,hd,pantalla,peso,serie,costo);
		
		m.muestraDatos(c);
		
	}

}
