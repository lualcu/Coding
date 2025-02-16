package asociacion_figuras;

import javax.swing.JOptionPane;

public class Cuadrado {
	double lado;
	public void area() {
		
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Lado: ",
				"Lado", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Area es: " + Math.pow(lado, 2), "Area-Cuadrado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public void perimetro() {
		lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Lado: ",
				"Lado", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Perimetro es: " + (lado*4), "Perimetro-Cuadrado",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
