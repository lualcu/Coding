package asociacion_figuras;

import javax.swing.JOptionPane;

public class Circulo {
	double radio;
	public void area() {
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa el Radio: ", "Radio-Circulo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Area es: " + (Math.pow(radio, 2)*Math.PI), "Area-Circulo",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public void perimetro() {
		radio = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa el Radio: ", "Radio-Circulo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Perimetro es: " + (radio*2*Math.PI), "Perimetro-Circulo",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
