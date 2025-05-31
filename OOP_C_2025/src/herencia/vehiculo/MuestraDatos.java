package herencia.vehiculo;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	
	Image imgDepor = new ImageIcon("src/general.icons/DEPORTIVO.png").getImage();
	ImageIcon depor =new ImageIcon(imgDepor.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgFurgo = new ImageIcon("src/general.icons/FURGONETA.png").getImage();
	ImageIcon furgo= new ImageIcon(imgFurgo.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	Image imgTuris = new ImageIcon("src/general.icons/TURISMO.png").getImage();
	ImageIcon turis= new ImageIcon(imgTuris.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	JTextArea salida = new JTextArea();
	String datos1 = "Matricula\tMarca\tModelo\tColor\tPrecio\tPuertas\tTransmision\n";
	String datos2 = "Matricula\tMarca\tModelo\tColor\tPrecio\tCilindros\n";
	String datos3 = "Matricula\tMarca\tModelo\tColor\tPrecio\tCarga\tVolumen\n";
	
	public void muestraTurismo(Turismo t) {
		if(t.getColor() != null) {
		datos1 += "--------------------------------------------"
				+ "-------------------------------------------\n";
		datos1 += t.getMatricula() + "\t" + t.getMarca() + "\t" + t.getModelo() + "\t" + 
		t.getColor() + "\t" + t.getPrecio() + "\t" + 
		t.getPuertas() + "\t" + t.getTransmisión() + "\n";
		
		// Colocar Datos en Salida
		salida.setText(datos1);
		}
		//Colocar salida en JOptionPane
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Turismo",
				JOptionPane.INFORMATION_MESSAGE, turis);
	}
	
	public void muestraDeportivo(Deportivo d) {
		if(d.getColor() != null) {
		datos2 += "--------------------------------------------"
				+ "-------------------------------------------\n";
		datos2 += d.getMatricula() + "\t" + d.getMarca() + "\t" + d.getModelo() + "\t" + 
		d.getColor() + "\t" + d.getPrecio() + "\t" + 
		d.getCilindros() + "\n";
		
		// Colocar Datos en Salida
		salida.setText(datos2);
		}
		//Colocar salida en JOptionPane
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Deportivo",
				JOptionPane.INFORMATION_MESSAGE, depor);
	}
	
	public void muestraFurgoneta(Furgoneta f) {
		if(f.getColor() != null) {
		datos3 += "--------------------------------------------"
				+ "-------------------------------------------\n";
		datos3 += f.getMatricula() + "\t" + f.getMarca() + "\t" + f.getModelo() + "\t" + 
		f.getColor() + "\t" + f.getPrecio() + "\t" + 
		f.getCarga() + "\t" + f.getVolumen()+ "\n";
		
		// Colocar Datos en Salida
		salida.setText(datos3);
		}
		//Colocar salida en JOptionPane
		JOptionPane.showMessageDialog(null, salida, "Vehiculos - Furgoneta",
				JOptionPane.INFORMATION_MESSAGE, furgo);
	}
	
	
	
	

}
