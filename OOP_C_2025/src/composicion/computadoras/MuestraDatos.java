package composicion.computadoras;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	JTextArea salida = new JTextArea();
	String datos = "Marca\tModelo\tProcesador\tRAM\tHd\tPantalla\tPeso\tSerie\tCosto\n";
	
	Image imgComp = new ImageIcon("src/general.icons/COMPUTADORA.png").getImage();
	ImageIcon comp =  new ImageIcon(imgComp.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	
	public void muestraDatos (Computadora c) {
		datos += "--------------------------------------------------------------------"
				+ "--------------------------------------\n";
		// Concatenar la informacion del Objeto C
		datos += c.getMarca() + "\t" + c.getModelo() + "\t" + c.getProcesador() 
		+ "\t" + c.getRam() + "\t" + c.getHd() + "\t" + c.getPantalla() + "\t" 
				+ c.getPeso() + "\t" + c.getSerie() + "\t" + c.getCosto() + "\n";
		// Colocar la variable datos en un JTextArea
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Computadora", 
				JOptionPane.INFORMATION_MESSAGE, comp);
		
		c.encender();
		c.apagar();
		c.procesar();
	}
}
