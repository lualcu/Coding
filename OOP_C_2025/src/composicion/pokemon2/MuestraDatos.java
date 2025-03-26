package composicion.pokemon2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class MuestraDatos {
	JTextArea salida = new JTextArea();
	Image imgAviso = new ImageIcon("src/general.icons/POKEMON.png").getImage();
	ImageIcon aviso= new ImageIcon(imgAviso.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	String datos = "Nombre\tEspecie\tTipo\tHabitat\tPeso\tAltura\n";
	public void muestraDatos (Pokemon p) {
		datos += "-----------------------------------------------------------------\n";
		// Concatenar la informacion del objeto P
		datos += p.getNombre() + "\t" + p.getEspecie() + "\t" + p.getTipo() + "\t" 
		+ p.getHabitat() + "\t" + p.getPeso() + "\t" + p.getAltura() + "\n";
		// Colocar la Variable Datos en un JTextArea
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Reporte de Pokemon´s", 
				JOptionPane.INFORMATION_MESSAGE, aviso);
	}
	
}
