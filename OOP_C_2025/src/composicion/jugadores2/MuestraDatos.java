package composicion.jugadores2;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	
	JTextArea salida = new JTextArea();
	Image icon = new ImageIcon("src/general.icons/JUGADOR.png").getImage();
	ImageIcon icon2 = new ImageIcon(icon.getScaledInstance(124, 124, Image.SCALE_SMOOTH));
	String datos = "Nombre\tApellido\tEdad\tEquipo\tPosicion\tDorsal\tSalario\tNacionalidad\tCorreo\n";
	
	
	public void muestraDatos(Jugador j) {
		
		
		datos += "---------------------------------------------------"
				+ "--------------------------------------------------\n";
		
		datos += j.getNombre() + "\t" + j.getApellido() + "\t" + j.getEdad() + "\t" + j.getEquipo() + 
		"\t" + j.getPosicion() + "\t" + j.getNumeral() + "\t" + j.getSalario() + "\t" 
		+ j.getNacionalidad() + "\t" + j.getCorreo() + "\n";
		
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Jugadores", 
				JOptionPane.INFORMATION_MESSAGE, icon2);
		
	}
	

}
