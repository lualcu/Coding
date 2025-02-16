package asociacion_figuras;

import javax.swing.JOptionPane;

public class Triangulo {
	double base, altura, lado;
	public void area() {
		base = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Base: ", "Base-Triangulo", JOptionPane.INFORMATION_MESSAGE));
		altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Ingresa la Altura: ", "Altura-Triangulo", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El Area es: " + ((base*altura)/2), "Area-Triangulo",
				JOptionPane.INFORMATION_MESSAGE);
	}
	public void perimetro() {
		lado = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Ingresa el Lado: ", "Lado-Triangulo", JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showMessageDialog(null, "El Perimetro es: " + (lado*3), "Perimetro-Triangulo",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
