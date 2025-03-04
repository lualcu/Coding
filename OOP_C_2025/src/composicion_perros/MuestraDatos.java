package composicion_perros;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MuestraDatos {
	JTextArea salida = new JTextArea();
	String datos = "Nombre\tRaza\tPeso\tAltura\tNacim\n";
	public void muestraDatos(Perro p) {
		
		datos += "----------------------------------------------------------\n";
		datos += p.nombre + "\t" + p.raza + "\t" + p.peso + "\t" + p.altura + "\t" + p.nacimiento + "\n";
		// Colocar la variable datos en el JTextArea
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Reporte - Mascotas", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
