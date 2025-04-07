package composicion.perros2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	
	Image img = new ImageIcon("src/general.icons/MASCOTA.png").getImage();
	ImageIcon icon= new ImageIcon(img.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	JTextArea salida = new JTextArea();
	String datos = "Nombre\tRaza\tPeso\tAltura\tNacim\n";
	public void muestraDatos(Perro p) {
		
		datos += "----------------------------------------------------------\n";
		datos += p.getNombre() + "\t" + p.getRaza() + "\t" + p.getPeso() 
		+ "\t" + p.getAltura() + "\t" + p.getNacimiento() + "\n";
		// Colocar la variable datos en el JTextArea
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Reporte - Mascotas", 
		JOptionPane.INFORMATION_MESSAGE,icon);
		
		p.comer();
		p.dormir();
		p.ladrar();
		p.saltar();
		p.correr();
		
	}

}
