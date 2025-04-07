package composicion.pokemon;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	JTextArea salida = new JTextArea();
	String datos = "Nombre\tEspecie\tTipo\tHabitat\tPeso\tAltura\n";
	Image imgAviso = new ImageIcon("src/general.icons/POKEMON.png").getImage();
	ImageIcon aviso= new ImageIcon(imgAviso.getScaledInstance(70, 70, Image.SCALE_SMOOTH));
	public void muestraDatos (Pokemon p) {
		datos += "-----------------------------------------------------------------\n";
		// Concatenar la informacion del objeto P
		datos += p.nombre + "\t" + p.especie + "\t" + p.tipo + "\t" + p.habitat + "\t" + 
		p.peso + "\t" + p.altura + "\n";
		// Colocar la Variable Datos en un JTextArea
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Reporte de Pokemon´s", 
				JOptionPane.INFORMATION_MESSAGE,aviso);
		
		p.comer();
		p.dormir();
		p.pelear();
		p.saltar();
		p.correr();
	}

}
