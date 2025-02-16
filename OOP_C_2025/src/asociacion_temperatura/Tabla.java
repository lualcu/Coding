package asociacion_temperatura;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tabla {
	public double celtemp, fahrtemp, keltemp;
	String datos;
	JTextArea salida = new JTextArea();
	public void tabla() {
		datos = "C°\tF°\tK°\n";
		datos += String.format("%.2f", celtemp) + "\t" + String.format("%.2f", fahrtemp) + "\t" + String.format("%.2f", keltemp);
		salida.setText(datos);
		JOptionPane.showMessageDialog(null, salida, "Tabla Temp", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
