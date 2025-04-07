package composicion.jugadores;

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
		
		datos += j.nombre + "\t" + j.apellido + "\t" + j.edad + "\t" + j.equipo + "\t" 
		+ j.posicion + "\t" + j.numeral + "\t" + j.salario + "\t" + j.nacionalidad 
		+ "\t" + j.correo + "\n";
		
		salida.setText(datos);
		
		JOptionPane.showMessageDialog(null, salida, "Catalogo - Jugadores", 
				JOptionPane.INFORMATION_MESSAGE, icon2);
		
		j.correr();
		j.saltar();
		j.pegar();
		j.anotar();
		j.festejar();
		
	}
	

}
